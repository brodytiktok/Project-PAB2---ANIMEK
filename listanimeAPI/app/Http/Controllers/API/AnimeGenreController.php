<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Anime_genres;
use DB;

class AnimeGenreController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        try {
            $animegenres = Anime_Genres::all();
            if($animegenres){
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$animegenres
                ]);
            }
            else{
                return response()->json([
                    'status'=>400,
                    'pesan'=>'gagal',
                ],400);
            }
        } catch (\Exception $e) {
            return response()->json([
                'status'=>400,
                'pesan'=>'gagal',
            ],400);
        }
    }

    /**
     * Store a newly created resource in storage.
     *
     * @param  \Illuminate\Http\Request  $request
     * @return \Illuminate\Http\Response
     */
    public function store(Request $request)
    {
        try {
            $animegenres = new Anime_genres;
            $animegenres->id_anime = $request->id_anime;
            $animegenres->id_genre = $request->id_genre;
            $animegenres->save();
            if($animegenres){
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$animegenres
                ]);
            }
            else{
                return response()->json([
                    'status'=>400,
                    'pesan'=>'gagal',
                ],400);
            }
        } catch (\Exception $e) {
            return response()->json([
                'status'=>400,
                'pesan'=>'gagal',
            ],400);
        }
    }

    /**
     * Display the specified resource.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function show($id)
    {
        $animegenres = DB::select('select genres.nama_genre as nama_genre 
        FROM anime_genres
        INNER JOIN genres ON anime_genres.id_genres = genres.id
        WHERE anime_genres.id_anime = ?', [$id]);
        if($animegenres){
            return response()->json([
                'status'=>200,
                'pesan'=>'berhasil',
                'data'=>$animegenres
            ]);
        }
        else{
            return response()->json([
                'status'=>400,
                'pesan'=>'gagal',
            ],400);
        }
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
        try {
            $animegenres = Anime_genres::find($id);
            if($animegenres){
                $animegenres->id_anime = $request->id_anime;
                $animegenres->id_genre = $request->id_genre;
                $animegenres->save();
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$animegenres
                ]);
            }
            else{
                return response()->json([
                    'status'=>400,
                    'pesan'=>'gagal',
                ],400);
            }
        } catch (\Exception $e) {
            return response()->json([
                'status'=>400,
                'pesan'=>'gagal',
            ],400);
        }
    }

    /**
     * Remove the specified resource from storage.
     *
     * @param  int  $id
     * @return \Illuminate\Http\Response
     */
    public function destroy($id)
    {
        try {
            $animegenres = Anime_genres::find($id);
            if($animegenres){
                $animegenres->delete();
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                ]);
            }
            else{
                return response()->json([
                    'status'=>400,
                    'pesan'=>'gagal',
                ],400);
            }
        } catch (\Exception $e) {
            return response()->json([
                'status'=>400,
                'pesan'=>'gagal',
            ],400);
        }
    }
}
