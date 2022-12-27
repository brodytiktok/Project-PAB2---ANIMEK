<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Anime_genres;

class AnimeGenreController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        $animegenres = Anime_genres::all();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$animegenres
        ]);
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        $animegenres = new Anime_genres;
        $animegenres->id_anime = $request->id_anime;
        $animegenres->id_genre = $request->id_genre;
        $animegenres->save();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$animegenres
        ]);
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        $animegenres = Anime_genres::find($id);
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$animegenres
        ]);
    }


    /**
     * Update the specified resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function update(Request $request, $id)
    {
        $animegenres = Anime_genres::find($id);
        $animegenres->id_anime = $request->id_anime;
        $animegenres->id_genre = $request->id_genre;
        $animegenres->save();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
            'data'=>$animegenres
        ]);
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        $animegenres = Anime_genres::find($id);
        $animegenres->delete();
        return response()->json([
            'status'=>200,
            'pesan'=>'berhasil',
        ]);
    }
}
