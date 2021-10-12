package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val komponenpcList = listOf<komponenpc>(
            komponenpc(
                R.drawable.motherboard,
                "motherboard H310 GIGABYTE\n",
                "-Supports 9th and 8th Gen Intel® Core™ Processors\n" +
                        "-Dual Channel Non-ECC Unbuffered DDR4\n" +
                        "-New Hybrid Digital PWM Design\n" +
                        "-Intel® CNVi 802.11ac Wave2 2T2R WIFI Upgradable\n" +
                        "-8-Channel HD Audio with High Quality Audio Capacitors\n" +
                        "-Ultra-Fast M.2 with PCIe Gen2 X2 & SATA interface\n" +
                        "-GIGABYTE Exclusive 8118 Gaming LAN with Bandwidth Management\n" +
                        "-CEC 2019 Ready, Save Power With a Simple Click\n" +
                        "-Smart Fan 5 features Multiple Temperature Sensors and Hybrid Fan Headers with FAN STOP\n" +
                        "-All new GIGABYTE™ APP Center, simple and easy use\n" +
                        "-Anti-Sulfur Resistors Design\n" +
                        "-GIGABYTE UEFI DualBIOS™"

            ),
            komponenpc(
                R.drawable.gtx,
                "VGA GTX 1650 MSI",
                "-Boost Clock / Memory Speed 1860 MHz / 8 Gbps\n" +
                        "-4GB GDDR5\n" +
                        "-DisplayPort x 2 / HDMI x 1"

            ),
            komponenpc(
                R.drawable.intel,
                "prosesor intel core i3 9100F",
                "-Memiliki 4Core dan 4Thread\n" +
                        "-Frekuensi Dasar 3.60GHz\n" +
                        "-Frekuensi Max 4.20GHz\n" +
                        "-Memiliki Cache Sebesar 6MB\n" +
                        "-Memiliki TDP 65W"
            ),
            komponenpc(
                R.drawable.ddr,
                "RAM 16GB ddr4 TFORCE",
                "-Full frame 120° ultra wide angle lighting\n" +
                        "-Built-in Force Flow RGB lighting effect\n" +
                        "-Aluminum alloy heat spreader with asymmetric minimalist design\n" +
                        "-Supports ASUS Aura Sync software synchronization\n" +
                        "-Latest JEDEC RC 2.0 PCB\n" +
                        "-Energy saving 1.2V~1.4V ultra low working voltage\n" +
                        "-Supports XMP2.0 one-click overclocking technology\n" +
                        "QVL approved by all mainstream motherboard manufacturers"
            ),
            komponenpc(
                R.drawable.ssd,
                "SSD XPG 512GB",
                "-Experience Stunning Speed\n" +
                        "-In Pursuit of Higher Performance\n" +
                        "-3D NAND Flash - Higher Capacity, Efficiency, and Reliability\n" +
                        "- LDPC ECC Ensures Data Integrity\n" +
                        "-E2E Data Protection and RAID Engine\n" +
                        "-Backed by a 5-Year Warranty\n" +
                        "-Cool XPG heatsink included"
            )

        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_komponen)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = KomponenPcAdapter(this, komponenpcList){
            val intent = Intent (this,DetailKomponenActivity::class.java )
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}


