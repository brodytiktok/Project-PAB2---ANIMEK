<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

return new class extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('characters', function (Blueprint $table) {
            $table->id();
            $table->unsignedBigInteger('id_seiyuu');
            $table->unsignedBigInteger('id_anime');
            $table->foreign('id_seiyuu')->references('id')->on('seiyuus')->onDelete('cascade');
            $table->foreign('id_anime')->references('id')->on('animes')->onDelete('cascade');
            $table->text('foto_character');
            $table->string('nama_character');
            $table->timestamps();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('characters');
    }
};
