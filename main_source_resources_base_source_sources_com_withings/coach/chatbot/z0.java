package com.withings.coach.chatbot;

import android.view.View;
import com.withings.wiscale2.activity.workout.ui.detail.a5;
import com.withings.zendesk.models.ZendeskLabelData;
import com.withings.zendesk.ui.LabelAdapter;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f33131a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f33132b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f33133c;

    public /* synthetic */ z0(int i11, Object obj, Object obj2) {
        this.f33131a = i11;
        this.f33132b = obj;
        this.f33133c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f33131a;
        Object obj = this.f33133c;
        Object obj2 = this.f33132b;
        switch (i11) {
            case 0:
                DateTimePicker.t((DateTimePicker) obj, (ym0.l) obj2);
                return;
            case 1:
                a5.b((ym0.l) obj2, (a5) obj);
                return;
            default:
                LabelAdapter.e((ZendeskLabelData) obj2, (LabelAdapter) obj, view);
                return;
        }
    }
}
