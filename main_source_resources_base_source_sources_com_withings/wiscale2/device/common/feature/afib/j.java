package com.withings.wiscale2.device.common.feature.afib;

import ah.z;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.core.webcontent.HMWebViewDelegate;
import com.withings.partner.model.Partner;
import com.withings.programs.model.ProgramOld;
import com.withings.wiscale2.device.common.feature.spo2.SpO2SettingsActivity;
import com.withings.wiscale2.heart.HeartDetailActivity;
import com.withings.wiscale2.legacyprograms.ProgramArchiveHolder;
import com.withings.wiscale2.profile.v0;
import com.withings.wiscale2.settings.b0;
import com.withings.wiscale2.settings.d0;
import com.withings.zendesk.ui.SectionAdapter;
import zendesk.support.Section;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f51025a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f51026b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f51027c;

    public /* synthetic */ j(int i11, Object obj, Object obj2) {
        this.f51025a = i11;
        this.f51027c = obj;
        this.f51026b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f51025a;
        Object obj = this.f51026b;
        Object obj2 = this.f51027c;
        switch (i11) {
            case 0:
                AfibSettingsActivity this$0 = (AfibSettingsActivity) obj2;
                Integer num = (Integer) obj;
                int i12 = AfibSettingsActivity.f50991j;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                ch.d dVar = this$0.f50996i;
                if (dVar != null) {
                    ch.h m11 = dVar.m();
                    Context context = view.getContext();
                    kotlin.jvm.internal.u.i(context, "getContext(...)");
                    String string = this$0.getString(num.intValue());
                    kotlin.jvm.internal.u.i(string, "getString(...)");
                    this$0.startActivity(((z) m11).b(context, Uri.parse(string), true, new HMWebViewDelegate()));
                    return;
                }
                kotlin.jvm.internal.u.s("intentBuilder");
                throw null;
            case 1:
                SpO2SettingsActivity this$02 = (SpO2SettingsActivity) obj2;
                Integer num2 = (Integer) obj;
                SpO2SettingsActivity.a aVar = SpO2SettingsActivity.f52495j;
                kotlin.jvm.internal.u.j(this$02, "this$0");
                ch.d dVar2 = this$02.f52498f;
                if (dVar2 != null) {
                    ch.h m12 = dVar2.m();
                    Context context2 = view.getContext();
                    kotlin.jvm.internal.u.i(context2, "getContext(...)");
                    String string2 = this$02.getString(num2.intValue());
                    kotlin.jvm.internal.u.i(string2, "getString(...)");
                    this$02.startActivity(((z) m12).b(context2, Uri.parse(string2), true, new HMWebViewDelegate()));
                    return;
                }
                kotlin.jvm.internal.u.s("intentBuilder");
                throw null;
            case 2:
                d80.b this_bind = (d80.b) obj2;
                ng0.d event = (ng0.d) obj;
                kotlin.jvm.internal.u.j(this_bind, "$this_bind");
                kotlin.jvm.internal.u.j(event, "$event");
                Context context3 = this_bind.a().getContext();
                long b10 = event.b();
                long c11 = event.c();
                int i13 = HeartDetailActivity.f57003o;
                this_bind.a().getContext().startActivity(new Intent(context3, HeartDetailActivity.class).putExtra("measure_type", 1).putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, c11).putExtra("measure_group_id", b10));
                return;
            case 3:
                ProgramArchiveHolder.bind$lambda$2((ProgramArchiveHolder) obj2, (ProgramOld) obj, view);
                return;
            case 4:
                v0.a aVar2 = (v0.a) obj2;
                Partner partner = (Partner) obj;
                int i14 = com.withings.wiscale2.profile.l.f59388e;
                kotlin.jvm.internal.u.j(partner, "$partner");
                if (aVar2 != null) {
                    aVar2.V(partner);
                    return;
                }
                return;
            case 5:
                d0.a((b0) obj2, (d0) obj);
                return;
            default:
                SectionAdapter.d((SectionAdapter) obj2, (Section) obj, view);
                return;
        }
    }
}
