<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Animes extends Model
{
    use HasFactory;
    protected $table = 'animes';

    public function Anime_genres()
    {
        return $this->belongsTo(Anime_genres::class, 'id', 'id_anime');
    }

}
