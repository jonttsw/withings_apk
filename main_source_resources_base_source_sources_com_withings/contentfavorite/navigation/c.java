package com.withings.contentfavorite.navigation;

import androidx.compose.material3.j5;
import com.withings.contentproviders.model.content.TaskType;
import com.withings.favorite.model.FavoriteCategory;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import ym0.p;
import ym0.r;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContentFavoriteNavGraph.kt */
/* loaded from: classes3.dex */
public final class c extends w implements r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<FavoriteCategory, String, y> f35250a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f35251b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<TaskType, y> f35252c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p<? super FavoriteCategory, ? super String, y> pVar, ym0.a<y> aVar, l<? super TaskType, y> lVar) {
        super(4);
        this.f35250a = pVar;
        this.f35251b = aVar;
        this.f35252c = lVar;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        ym0.a<y> aVar2 = this.f35251b;
        l<TaskType, y> lVar = this.f35252c;
        wl.a.a(null, this.f35250a, aVar2, lVar, aVar, 0, 1);
        return y.f85009a;
    }
}
