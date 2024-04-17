package com.withings.alarm.ui;

import ah.u;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.TextView;
import com.withings.device.details.wsd.programs.WsdProgramActivity;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f31160b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f31161c;

    public /* synthetic */ k(int i11, Object obj, Object obj2) {
        this.f31159a = i11;
        this.f31160b = obj;
        this.f31161c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        int i12 = this.f31159a;
        Object obj = this.f31161c;
        Object obj2 = this.f31160b;
        switch (i12) {
            case 0:
                l lVar = (l) obj2;
                TextView textView = lVar.f31179q;
                textView.setTextColor(u.v(16842806, textView.getContext()));
                String obj3 = ((EditText) obj).getText().toString();
                textView.setText(obj3);
                lVar.f31163a.c0(obj3);
                lVar.f31164b.c1(lVar.f31163a);
                return;
            case 1:
                WsdProgramActivity.C3((WsdProgramActivity) obj2, (List) obj, i11);
                return;
            default:
                he0.d.T1((he0.d) obj2, (String[]) obj, dialogInterface, i11);
                return;
        }
    }
}
