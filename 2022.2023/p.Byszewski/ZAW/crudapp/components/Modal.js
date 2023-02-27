import React from 'react'

export default function Modal(props) {
    const {setOpenModal} = props
  return (
    <div className='fixed inset-0 bg-white text-slate-900 flex flex-col border-solid border-slate-900 p-4'>
        <div className='flex-1 flex justify-between items-center'>
        <h1>MENU</h1>
        <i class="fa-sharp fa-solid fa-xmark"></i>
        </div>
        <div className='p-4 flex flex-col gap-3'>
            <h2>Logout</h2>
        </div>
    </div>
  )
}
