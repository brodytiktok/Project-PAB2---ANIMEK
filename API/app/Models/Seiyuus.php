<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Seiyuus extends Model
{
    use HasFactory;
    protected $table = 'seiyuus';

    public function Characters()
    {
        return $this->belongsTo(Characters::class, 'id', 'id_characters');
    }

}
