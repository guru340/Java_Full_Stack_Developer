import React from "react";
import "./Mycard.css";

function Mycard(props) {
  return (
    <>
      <div className="card">
        <div className="card-body">
          <h3 className="heading">{props.heading}</h3>
          <p className="heading">
            Mayank Sangwani Box
          </p>
        </div>
      </div>
    </>
  );
}

export default Mycard;
