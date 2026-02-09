import { atom, selector } from "recoil";
export const myNetwork = atom({
    key: "myNetwork",
    default: 102
});


export const jobAtom = atom({
    key: "JobAtom",
    default: 0
});


export const messagingnetwork = atom({
    key: "messagingnetworkAtom",
    default: 12
});


export const notificationAtom = atom({
    key: "NetworkAtom",
    default: 0
});

export const totalsum1 = selector({
    key: "toatalsum1",
    get: ({ get }) => {
        const myNetwork1 = get(myNetwork);
        const jobAtom1 = get(jobAtom);
        const messagingnetwork1 = get(messagingnetwork);
        const notificationAtom1 = get(notificationAtom);
        return myNetwork1 + jobAtom1 + messagingnetwork1 + notificationAtom1;
    }
});