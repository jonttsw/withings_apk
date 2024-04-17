package com.withings.coach.chatbot;

import android.view.View;
import com.withings.webservices.legacy.withings.model.timeline.InsightItemData;
import tb0.y2;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33127a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f33128b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f33129c;

    public /* synthetic */ y0(int i11, Object obj, Object obj2) {
        this.f33127a = i11;
        this.f33128b = obj;
        this.f33129c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f33127a;
        Object obj = this.f33129c;
        Object obj2 = this.f33128b;
        switch (i11) {
            case 0:
                DateTimePicker.w((DateTimePicker) obj2, (ym0.l) obj);
                return;
            case 1:
                he0.d this$0 = (he0.d) obj2;
                View view2 = (View) obj;
                int i12 = he0.d.f70646y;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                kotlin.jvm.internal.u.j(view2, "$view");
                this$0.B1(view2);
                return;
            case 2:
                com.withings.wiscale2.device.wam02.ui.e.s1((com.withings.wiscale2.device.wam02.ui.e) obj2, (y2) obj);
                return;
            case 3:
                com.withings.wiscale2.heart.bloodpressure.d0.u1((View) obj2, (com.withings.wiscale2.heart.bloodpressure.d0) obj);
                return;
            default:
                com.withings.wiscale2.insight.a.u1((com.withings.wiscale2.insight.a) obj2, (InsightItemData) obj);
                return;
        }
    }
}
