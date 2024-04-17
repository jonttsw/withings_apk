package com.withings.factor.local.dao;

import com.withings.prediction.local.dao.PredictionDao_ProdRoomDb_Impl;
import java.util.List;
import qm0.d;
import ym0.l;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f39098a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f39099b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f39100c;

    public /* synthetic */ b(int i11, Object obj, List list) {
        this.f39098a = i11;
        this.f39100c = obj;
        this.f39099b = list;
    }

    @Override // ym0.l
    public final Object invoke(Object obj) {
        int i11 = this.f39098a;
        List list = this.f39099b;
        Object obj2 = this.f39100c;
        switch (i11) {
            case 0:
                return FactorDao_RoomDb_Impl.a((FactorDao_RoomDb_Impl) obj2, list, (d) obj);
            default:
                return PredictionDao_ProdRoomDb_Impl.a((PredictionDao_ProdRoomDb_Impl) obj2, list, (d) obj);
        }
    }
}
