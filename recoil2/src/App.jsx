import { useState } from "react";
import { RecoilRoot, useRecoilState, useRecoilValue } from "recoil";
import { jobAtom, messagingnetwork, myNetwork, notificationAtom, totalsum1 } from "./atoms";

function App() {
  return (
    <>
      <RecoilRoot>
        <MainApp />
      </RecoilRoot>
    </>
  );
}

function MainApp() {
  const networknotificationcount = useRecoilValue(myNetwork);
  const jobcount = useRecoilValue(jobAtom);
  const notificationcount = useRecoilValue(notificationAtom);
  // If you want to update the value of messagingcount
  const messagingcount = useRecoilValue(messagingnetwork);
  const totalsum = useRecoilValue(totalsum1);

  return (
    <>
      <button>Home</button>
      <button>
        MyNetwork({networknotificationcount >= 100 ? "99+" : networknotificationcount})
      </button>
      <button>Jobs({jobcount})</button>
      <button >Messaging({messagingcount})</button>
      <button>Notification({notificationcount})</button>
      <button>Me({totalsum})</button>
    </>
  );
}

export default App;
