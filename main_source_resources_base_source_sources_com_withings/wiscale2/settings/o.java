package com.withings.wiscale2.settings;

import com.withings.favorite.model.FavoriteCategoryKt;
import com.withings.wiscale2.settings.DatabaseInfoActivity;
/* compiled from: DatabaseInfoActivity.kt */
/* loaded from: classes5.dex */
final class o extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity f60213a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity.a f60214b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DatabaseInfoActivity databaseInfoActivity, DatabaseInfoActivity.a aVar) {
        super(3);
        this.f60213a = databaseInfoActivity;
        this.f60214b = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h SectionCardColumn = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(SectionCardColumn, "$this$SectionCardColumn");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            DatabaseInfoActivity.a aVar3 = this.f60214b;
            DatabaseInfoActivity.z3(this.f60213a, FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, aVar3.m(), false, aVar2, 4486, 0);
            DatabaseInfoActivity.z3(this.f60213a, "Main User", aVar3.n(), false, aVar2, 4102, 4);
            DatabaseInfoActivity.z3(this.f60213a, "Ahi", aVar3.a(), false, aVar2, 4102, 4);
            DatabaseInfoActivity.z3(this.f60213a, "Bed", aVar3.b(), false, aVar2, 4102, 4);
            DatabaseInfoActivity.z3(this.f60213a, "Body", aVar3.c(), false, aVar2, 4102, 4);
            DatabaseInfoActivity.z3(this.f60213a, "Motion", aVar3.d(), false, aVar2, 4102, 4);
            DatabaseInfoActivity.z3(this.f60213a, "Pause", aVar3.e(), false, aVar2, 4102, 4);
            DatabaseInfoActivity.z3(this.f60213a, "Spo2", aVar3.k(), false, aVar2, 4102, 4);
            DatabaseInfoActivity.z3(this.f60213a, "Swim", aVar3.l(), false, aVar2, 4102, 4);
        }
        return nm0.y.f85009a;
    }
}
