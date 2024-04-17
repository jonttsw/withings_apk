package com.withings.alarm.model;

import android.content.Context;
import com.withings.alarm.model.WsdProgramElement;
/* compiled from: WsdProgramCategory.java */
/* loaded from: classes3.dex */
public final class a extends WsdProgramElement {

    /* renamed from: c  reason: collision with root package name */
    private boolean f31096c;

    public a(WsdProgramElement.CategoryType categoryType, boolean z5) {
        super(0);
        this.f31096c = z5;
        this.f31089a = categoryType;
    }

    public final String c(Context context) {
        return context.getString(this.f31089a.a());
    }

    public final boolean d() {
        return this.f31096c;
    }
}
