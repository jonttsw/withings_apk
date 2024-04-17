package com.withings.views.view;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;
import l70.u;
/* compiled from: SpinnerExt.kt */
/* loaded from: classes4.dex */
public final class p extends ArrayAdapter<String> {

    /* renamed from: a  reason: collision with root package name */
    private final List<u> f46768a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p(Context context, List<? extends u> units) {
        super(context, 17367049);
        kotlin.jvm.internal.u.j(units, "units");
        this.f46768a = units;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.f46768a.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final Object getItem(int i11) {
        Context context = getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        return this.f46768a.get(i11).i(context);
    }
}
