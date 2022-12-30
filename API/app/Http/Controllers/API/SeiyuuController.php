<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Seiyuus;

class SeiyuuController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        try {
            $seiyuus = Seiyuus::all();
            if($seiyuus){
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$seiyuus
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
            $seiyuus = new Seiyuus;
            $seiyuus->foto_seiyuu = $request->foto_seiyuu;
            $seiyuus->nama_seiyuu = $request->nama_seiyuu;
            $seiyuus->save();
            if($seiyuus){
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$seiyuus
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
        $seiyuus = Seiyuus::find($id);
        if($seiyuus){
            return response()->json([
                'status'=>200,
                'pesan'=>'berhasil',
                'data'=>$seiyuus
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
            $seiyuus = Seiyuus::find($id);
            if($seiyuus){
                $seiyuus->foto_seiyuu = $request->foto_seiyuu;
                $seiyuus->nama_seiyuu = $request->nama_seiyuu;
                $seiyuus->save();
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$seiyuus
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
            $seiyuus = Seiyuus::find($id);
            if($seiyuus){
                $seiyuus->delete();
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