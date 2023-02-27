import React, {useState} from "react";
import {useAuth} from "../context/AuthContext";

export default function Login() {
    const [email, setEmail] = useState("")
    const [password, setPassword] = useState("")
    const [error, setError] = useState(null)
    const [isLoggingIn, setIsLoggingIn] = useState(true)

    const {login, signup, currentUser} = useAuth()
    console.log(currentUser)

    async function submitHandler() {
        if (!email || !password) {
            setError("Please fill in all fields")
            return
        }
        if (isLoggingIn) {
            try{
                await login(email, password)
            } catch(err) {
                setError('Incorrect email or password')
            }
            return
        }
        await signup(email, password)
    }


  return (
    <div className=" pt-40 text-xs sm:text-sm flex flex-1 flex-col justify-center items-center gap-2 sm:gap-8 ">
        <h1 className="font-extrbaold text-4xl sm:text-6xl uppercase">{isLoggingIn ? 'Login' : 'register'}</h1>
                {error && <div className=" border-pink-700 text-lg text-pink-300 border-b-4 text-center border-solid">
                {error}
                </div>}
            <input value={email} onChange={(e) => setEmail(e.target.value)} type="text" placeholder="Email Adress" className="outline-none duration-300 border-b-4 border-solid focus:border-violet-500 text-slate-900 p-2 w-40%"></input>
            <input value={password} onChange={(e) => setPassword(e.target.value)} type="password" placeholder="Password" className="outline-none duration-300 border-b-4 border-solid focus:border-violet-500 text-slate-900 p-2 w-45% "></input>
            <button onClick={submitHandler} className="bg-violet-700 text-white p-2 duration-300 hover:bg-blue-500">SUBMIT</button>
            <h2 className="duration-300 hover:scale-110 cursor-pointer uppercase" onClick={() =>setIsLoggingIn(!isLoggingIn)}>{!isLoggingIn ? 'Login' : 'register'}</h2>
    
    </div>
  );
}