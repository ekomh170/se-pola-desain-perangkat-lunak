START

// Langkah 2: Cek Barang dan Jadwal Kereta
CekBarang()
CekJadwalKereta()

// Langkah 3: Pergi ke Stasiun
PergiKeStasiun()

// Langkah 4: Cek Saldo Kartu Kereta
CekSaldoKartuKereta()

IF saldo >= cukup THEN
    // Langkah 8: Saldo cukup, lanjut masuk kereta
    TapKartuKereta()
    SaldoTerpotong()
    MasukKereta()
ELSE
    // Langkah 5: Saldo kurang, pergi ke loket isi ulang saldo
    PergiKeLoketIsiUlangSaldo()

    // Langkah 6: Isi ulang saldo
    IsiUlangSaldoKartuKereta()

    // Langkah 7: Tap kartu kereta kembali
    TapKartuKereta()
    SaldoTerpotong()
    MasukKereta()
ENDIF

// Langkah 9: Turun di Stasiun Pancasila
TurunDiStasiunPancasila()

// Langkah 10: Naik angkot ke kampus
NaikAngkotKeKampus()

// Langkah 11: Sampai di kampus
SampaiDiKampus()

END
