<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Animes;

class AnimeController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        try {
            $animes = Animes::all();
            if($animes){
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$animes
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
            $animes = new Animes;
            $animes->foto_anime = $request->foto_anime;
            $animes->judul_anime = $request->judul_anime;
            $animes->deskripsi_anime = $request->deskripsi_anime;
            $animes->save();
            if($animes){
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$animes
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
        $animes = Animes::find($id);
        if($animes){
            return response()->json([
                'status'=>200,
                'pesan'=>'berhasil',
                'data'=>$animes
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
            $animes = Animes::find($id);
            if($animes){
                $animes->foto_anime = $request->foto_anime;
                $animes->judul_anime = $request->judul_anime;
                $animes->deskripsi_anime = $request->deskripsi_anime;
                $animes->save();
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$animes
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
            $animes = Animes::find($id);
            if($animes){
                $animes->delete();
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
