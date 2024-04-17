package com.withings.wiscale2.heart;

import androidx.activity.result.ActivityResult;
import com.withings.wiscale2.heart.heartrate.w;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements androidx.activity.result.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f57464a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f57465b;

    public /* synthetic */ h(Object obj, int i11) {
        this.f57464a = i11;
        this.f57465b = obj;
    }

    @Override // androidx.activity.result.a
    public final void a(Object obj) {
        int i11 = this.f57464a;
        Object obj2 = this.f57465b;
        switch (i11) {
            case 0:
                HeartHistoryActivity.A3((HeartHistoryActivity) obj2, (ActivityResult) obj);
                return;
            default:
                w.t1((w) obj2, (ActivityResult) obj);
                return;
        }
    }
}
