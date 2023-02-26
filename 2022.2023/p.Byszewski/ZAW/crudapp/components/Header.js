import React from 'react'

export default function Header() {
  return (
    <div className='sticky top-0 w-full left-0 bg-inherit text-white flex items-center justify-between p-4 border-b border-solid border-purple-500'>
        <h1 className='text-3xl sm:text-6xl select-none'>GrowList</h1>
        <i class="fa-sharp fa-solid fa-seedling text-xl duration-300 hover:opacity-40 cursor-pointer sm:text-3xl"></i>
    </div>
  )
}
