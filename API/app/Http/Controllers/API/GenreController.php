<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Genres;

class GenreController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        try {
            $genres = Genres::all();
            if($genres){
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$genres
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
            $genres = new Genres;
            $genres->nama_genre = $request->nama_genre;
            $genres->save();
            if($genres){
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$genres
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
        $genres = Genres::find($id);
        if($genres){
            return response()->json([
                'status'=>200,
                'pesan'=>'berhasil',
                'data'=>$genres
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
            $genres = Genres::find($id);
            if($genres){
                $genres->nama_genre = $request->nama_genre;
                $genres->save();
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$genres
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
            $genres = Genres::find($id);
            if($genres){
                $genres->delete();
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