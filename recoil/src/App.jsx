import { RecoilState, useRecoilState } from "recoil";
import { countAtom } from "./root/atoms/count";

function App() {
  return (
    <div>
      <RecoilRoot>
        <Count />
      </RecoilRoot>

    </div>
  )
}

function Count() {
  return (
    <div>
      <CountRender />
      <Buttons />
    </div>
  )
}

function CountRender() {
  const count = useRecoilValue(countAtom);

  return (
    <div>
      <b>
        {count}
      </b>
    </div>
  )
}

function Buttons() {
  const [count, setCount] = useRecoilState(countAtom);

  return (
    <div>
      <button onClick={() => setCount(prev => prev + 1)}>
        Increment
      </button>
      <button onClick={() => setCount(prev => prev - 1)}>
        Decrement
      </button>
    </div>
  );
}

export default App;
