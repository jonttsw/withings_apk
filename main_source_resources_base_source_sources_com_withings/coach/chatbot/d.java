package com.withings.coach.chatbot;

import android.view.View;
import com.withings.insight.android.entity.Suggestion;
import com.withings.wiscale2.dashboard.item.RoomTemperatureSummaryView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f32980a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f32981b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f32982c;

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f32980a = i11;
        this.f32981b = obj;
        this.f32982c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f32980a;
        Object obj = this.f32982c;
        Object obj2 = this.f32981b;
        switch (i11) {
            case 0:
                ChatbotActivity.z3((ChatbotActivity) obj2, (Suggestion) obj);
                return;
            case 1:
                RoomTemperatureSummaryView.F((RoomTemperatureSummaryView) obj2, (qb0.f) obj);
                return;
            default:
                ld0.b.e2((ld0.a) obj2, (ld0.b) obj);
                return;
        }
    }
}
