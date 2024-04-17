package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.DialogInterface;
import com.google.android.material.textfield.TextInputEditText;
import java.util.List;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class s implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f49598a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f49599b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.l f49600c;

    public /* synthetic */ s(Object obj, com.google.android.material.bottomsheet.l lVar, int i11) {
        this.f49598a = i11;
        this.f49599b = obj;
        this.f49600c = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        int i12 = this.f49598a;
        com.google.android.material.bottomsheet.l lVar = this.f49600c;
        Object obj = this.f49599b;
        switch (i12) {
            case 0:
                v.v1((TextInputEditText) obj, (v) lVar);
                return;
            default:
                fi0.c.s1((List) obj, (fi0.c) lVar, i11);
                return;
        }
    }
}
