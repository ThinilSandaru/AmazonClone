import { StrictMode } from 'react'
import { createRoot } from 'react-dom/client'
import './index.css'
import CustomerHome from './CustomerHome.tsx'
import {createBrowserRouter, RouterProvider} from 'react-router-dom'


const router=createBrowserRouter([
	{ path: "/customer/home", element: <CustomerHome /> }




]);

createRoot(document.getElementById('root')!).render(
	<StrictMode>
		<RouterProvider router={router}></RouterProvider>
	</StrictMode>,
)
