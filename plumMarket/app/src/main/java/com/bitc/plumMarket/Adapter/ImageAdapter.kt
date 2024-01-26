package com.bitc.plumMarket.Adapter


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

import androidx.viewpager2.adapter.FragmentStateAdapter


class imageAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {
    var fragmentList = listOf<Fragment>()

    //  등록된 프래그먼트의 수 출력
    override fun getItemCount(): Int {
        return fragmentList.size
    }

    //  프래그먼트 리스트의 수 만큼 뷰 페이저에서 사용할 프래그먼트를 생성
    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}
