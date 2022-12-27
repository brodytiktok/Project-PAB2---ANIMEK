<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use DB;

class SeiyuuSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('seiyuus')->insert([
            'foto_seiyuu'=>'',
            'nama_seiyuu'=>'',
        ]);
    }
}
