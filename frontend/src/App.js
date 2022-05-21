import './App.css';

import {getAllStudents} from "./client";
import {useEffect, useState} from "react";

function App() {
    const [students, setStudents] = useState([]);

    const fetchAllStudents = () =>
        getAllStudents()
            .then(res => res.json())
            .then(data => setStudents(data));

    useEffect(() => {
        console.log("mounted");
        fetchAllStudents();
    }, []);

    if (students.length <= 0) {
        return "no data";
    }

    return students.map((student, index) => {
        return <p key={index}> {student.id} {student.name} {student.email} {student.gender} </p>
    });
}

export default App;
