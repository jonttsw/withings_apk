package com.withings.views.graphs;

import com.withings.views.graphs.GraphPopupView;
import kotlin.jvm.internal.u;
import rs.e;
/* compiled from: PopupMainContentProvider.kt */
/* loaded from: classes4.dex */
public abstract class c implements GraphPopupView.c {
    @Override // com.withings.views.graphs.GraphPopupView.c
    public String getPopupSubText(e datum) {
        u.j(datum, "datum");
        return null;
    }

    @Override // com.withings.views.graphs.GraphPopupView.c
    public GraphPopupView.a getPopupSubTextIcon(e datum) {
        u.j(datum, "datum");
        return null;
    }
}
