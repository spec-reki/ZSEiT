import Head from 'next/head'
import { Inter } from 'next/font/google'
import Login from '../components/Login'
import { useAuth } from '../context/AuthContext'
import UserDashboard from '../components/UserDashboard'

const inter = Inter({ subsets: ['latin'] })

export default function Home() {
  const { currentUser } = useAuth()
  return (
    <>
      <Head>
        <title>GrowList</title>
      </Head>
      {!currentUser &&<Login/>}
      {currentUser && <UserDashboard/>}
      
    </>
  )
}
