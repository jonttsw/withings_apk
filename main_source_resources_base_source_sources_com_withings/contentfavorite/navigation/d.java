package com.withings.contentfavorite.navigation;

import com.withings.contentproviders.model.content.TaskType;
import com.withings.favorite.model.FavoriteCategory;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: ContentFavoriteNavGraph.kt */
/* loaded from: classes3.dex */
final class d extends w implements p<FavoriteCategory, String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<TaskType, String, y> f35253a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(p<? super TaskType, ? super String, y> pVar) {
        super(2);
        this.f35253a = pVar;
    }

    @Override // ym0.p
    public final y invoke(FavoriteCategory favoriteCategory, String str) {
        FavoriteCategory favoriteCategory2 = favoriteCategory;
        String identifier = str;
        u.j(favoriteCategory2, "favoriteCategory");
        u.j(identifier, "identifier");
        TaskType a11 = sl.c.a(favoriteCategory2);
        if (a11 != null) {
            this.f35253a.invoke(a11, identifier);
        }
        return y.f85009a;
    }
}
