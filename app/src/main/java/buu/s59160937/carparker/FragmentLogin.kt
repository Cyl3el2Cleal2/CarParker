package buu.s59160937.carparker

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import buu.s59160937.carparker.databinding.FragmentFragmentLoginBinding


class FragmentLogin : Fragment() {
    // TODO: Rename and change types of parameters
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentFragmentLoginBinding>(
            inflater,
            R.layout.fragment_fragment_login, container, false
        )
//        binding.account?.user = "abv"
//        binding.account?.password = ""
//        binding.button.setOnClickListener {
//            var output : String = "Incorrect Account"
//            if(binding.user.text.toString() == "admin" && binding.password.text.toString() == "password"){
//                output = "Sign In Successful"
//            }
//            Toast.makeText(activity, output, Toast.LENGTH_SHORT).show()
//
//        }
//        binding.invalidateAll()
        return binding.root
    }



}
