package com.cfs.SpringP05.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserServices {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    @Autowired
    private PasswordEncoder encoder;

    public void saveUsers(List<UserRequest> userRequest){
        for (UserRequest req:userRequest){
            AppUser user=new AppUser();
            user.setUsername(req.getUsers());
            user.setPassword(encoder.encode(req.getPassword()));
            user.setEnabled(true);

            Set<javax.management.relation.Role> roleSet=new HashSet<>();
            for(String roleName:req.getRoles())
            {
                Role role=roleRepo.findByName(roleName)
                        .orElseGet(()->{
                            Role newRole=new Role();
                            newRole.setName(roleName);
                            return roleRepo.save(newRole);
                        });
                roleSet.add(role);

            }
            user.setRoles(roleSet);
            userRepo.save(user);
        }

    }
}
