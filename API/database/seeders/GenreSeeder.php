<?php

namespace Database\Seeders;

use Illuminate\Database\Console\Seeds\WithoutModelEvents;
use Illuminate\Database\Seeder;
use DB;

class GenreSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('genres')->insert([
            'nama_genre'=>'Action'
        ]);

        DB::table('genres')->insert([
            'nama_genre'=>'Comedy'
        ]);
    }
}
