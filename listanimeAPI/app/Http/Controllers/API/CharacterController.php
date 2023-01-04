<?php

namespace App\Http\Controllers\API;

use App\Http\Controllers\Controller;
use Illuminate\Http\Request;
use App\Models\Characters;

class CharacterController extends Controller
{
    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        try {
            $characters = Characters::all();
            if($characters){
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$characters
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
            $characters = new Characters;
            $characters->id_anime = $request->id_anime;
            $characters->id_seiyuu = $request->id_seiyuu;
            $characters->foto_character = $request->foto_character;
            $characters->nama_character = $request->nama_character;
            $characters->save();
            if($characters){
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$characters
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
        $characters = Characters::find($id);
        if($characters){
            return response()->json([
                'status'=>200,
                'pesan'=>'berhasil',
                'data'=>$characters
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
            $characters = Characters::find($id);
            if($characters){
                $characters->id_anime = $request->id_anime;
                $characters->id_seiyuu = $request->id_seiyuu;
                $characters->foto_character = $request->foto_character;
                $characters->nama_character = $request->nama_character;
                $characters->save();
                return response()->json([
                    'status'=>200,
                    'pesan'=>'berhasil',
                    'data'=>$characters
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
            $characters = Characters::find($id);
            if($characters){
                $characters->delete();
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