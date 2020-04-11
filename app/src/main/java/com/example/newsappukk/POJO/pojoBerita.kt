package com.example.newsappukk.POJO

import com.google.gson.annotations.SerializedName


/**
 * Created by Arsyal Raka on 10/04/20, 2020,
 * Saigusa231@gmail.com,
 * ScCreativeIndo
 */
class pojoBerita {

    @SerializedName("result")
    var data : List<GetDataBerita>? = null

    inner class GetDataBerita {
        @SerializedName("id_berita")
        val id_berita: Int? = null

        @SerializedName("judul_berita")
        val judul_berita: String? = null

        @SerializedName("gambar_berita")
        val gambar_berita: String? = null

        @SerializedName("isi_berita")
        val isi_berita: String? = null

        @SerializedName("id_kategori")
        val id_kategori: Int? = null

        @SerializedName("nama_kategori")
        val nama_kategori: String? = null

        @SerializedName("update_at")
        val update_at: String? = null

        @SerializedName("created_at")
        val created_at: String? = null
    }

}