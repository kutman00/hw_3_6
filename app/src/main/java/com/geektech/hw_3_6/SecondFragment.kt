package com.geektech.hw_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondFragment : Fragment() {
    private val data = arrayListOf<Sport>()
    private var recView: RecyclerView? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        recView = view.findViewById(R.id.recycler_view)
        var adapter = SportAdapter(data = data)
        recView?.adapter = adapter
        recView?.layoutManager = GridLayoutManager(requireContext(), 2)
    }

    private fun loadData() {

        data.add(
            Sport(
                R.color.kut1,
                R.color.kut2,
                "Футбол",
                "https://w7.pngwing.com/pngs/87/51/png-transparent-football-player-graphy-football-sport-sports-equipment-shoe.png"
            )
        )
        data.add(
            Sport(
                R.color.red1,
                R.color.red2,
                "Волейбол",
                "https://i.pinimg.com/originals/29/81/4e/29814ec4c6e92619d1388a77df1f0f63.jpg"
            )
        )
        data.add(
            Sport(
                R.color.k1,
                R.color.k2,
                "Баскетбол",
                "https://png.pngtree.com/png-vector/20190723/ourlarge/pngtree-basketball-dribble-watercolor-png-image_1583188.jpg"
            )
        )
        data.add(
            Sport(
                R.color.z1,
                R.color.z2,
                "Тенис",
                "https://ts-sport.net/wp-content/uploads/2020/12/tennis.png"
            )
        )
        data.add(
            Sport(
                R.color.blue,
                R.color.blue1,
                "Гольф",
                "https://pngimg.com/uploads/golf/golf_PNG26.png"
            )
        )
        data.add(
            Sport(
                R.color.b2,
                R.color.b1,
                "Бейсбол",
                "https://c0.klipartz.com/pngpicture/693/982/gratis-png-bates-de-beisbol-guante-de-beisbol-bateo-beisbol.png"
            )
        )
        data.add(
            Sport(
                R.color.x1,
                R.color.x2,
                "Хокей",
                "https://w7.pngwing.com/pngs/847/145/png-transparent-ice-hockey-hockey-stick-hockey-puck-hockey-player-blue-sport-computer-wallpaper.png"
            )
        )
        data.add(
            Sport(
                R.color.g1,
                R.color.g2,
                "Гандбол",
                "https://img1.freepng.ru/20180703/tof/kisspng-2017-asian-men-s-club-league-handball-championship-drawing-t-shirt-5b3b2cb9bf35d5.6991678215306047297832.jpg"
            )
        )
    }
}
