import Head from 'next/head'
import { Inter } from 'next/font/google'
import Login from '../components/Login'

const inter = Inter({ subsets: ['latin'] })

export default function Home() {
  return (
    <div>
      <Head>
        <title>GrowList</title>
      </Head>
      <Login />
      <i class="fa-sharp fa-solid fa-user"></i>
    </div>
  )
}
