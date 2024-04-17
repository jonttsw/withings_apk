package com.withings.wiscale2.settings;

import com.withings.favorite.model.FavoriteCategoryKt;
import com.withings.wiscale2.settings.DatabaseInfoActivity;
/* compiled from: DatabaseInfoActivity.kt */
/* loaded from: classes5.dex */
final class p extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity f60230a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity.a f60231b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(DatabaseInfoActivity databaseInfoActivity, DatabaseInfoActivity.a aVar) {
        super(3);
        this.f60230a = databaseInfoActivity;
        this.f60231b = aVar;
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
            DatabaseInfoActivity.a aVar3 = this.f60231b;
            DatabaseInfoActivity.z3(this.f60230a, FavoriteCategoryKt.SEGMENTED_ITEM_ALL_KEY, aVar3.g(), false, aVar2, 4486, 0);
            DatabaseInfoActivity.z3(this.f60230a, "Main User", aVar3.h(), false, aVar2, 4102, 4);
        }
        return nm0.y.f85009a;
    }
}
