package com.withings.wiscale2.settings;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import com.withings.wiscale2.Theme;
import java.util.ArrayList;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class b2 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f59879a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f59880b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(SettingsActivity settingsActivity, k1.r0<String> r0Var) {
        super(0);
        this.f59879a = settingsActivity;
        this.f59880b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11;
        k1.r0<String> r0Var = this.f59880b;
        final SettingsActivity settingsActivity = this.f59879a;
        final a2 a2Var = new a2(settingsActivity, r0Var);
        kotlin.jvm.internal.u.j(settingsActivity, "<this>");
        final Theme[] themeArr = (Theme[]) ((kotlin.collections.a) Theme.a()).toArray(new Theme[0]);
        int j5 = androidx.appcompat.app.f.j();
        int length = themeArr.length;
        int i12 = 0;
        while (true) {
            if (i12 < length) {
                if (themeArr[i12].d() == j5) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i12);
        if (i12 == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            i11 = valueOf.intValue();
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList(themeArr.length);
        for (Theme theme : themeArr) {
            arrayList.add(settingsActivity.getText(theme.b()));
        }
        qc.b bVar = new qc.b(settingsActivity);
        bVar.o((CharSequence[]) arrayList.toArray(new CharSequence[0]), i11, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.c3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                Context this_promptThemeChoice = settingsActivity;
                kotlin.jvm.internal.u.j(this_promptThemeChoice, "$this_promptThemeChoice");
                Theme[] themes = themeArr;
                kotlin.jvm.internal.u.j(themes, "$themes");
                ym0.l onThemeChanges = a2Var;
                kotlin.jvm.internal.u.j(onThemeChanges, "$onThemeChanges");
                dialogInterface.dismiss();
                SharedPreferences a11 = androidx.preference.b.a(this_promptThemeChoice);
                kotlin.jvm.internal.u.i(a11, "getDefaultSharedPreferences(...)");
                SharedPreferences.Editor edit = a11.edit();
                edit.putString("app-theme", themes[i13].e());
                edit.apply();
                androidx.appcompat.app.f.F(themes[i13].d());
                String string = this_promptThemeChoice.getString(d3.a());
                kotlin.jvm.internal.u.i(string, "getString(...)");
                onThemeChanges.invoke(string);
            }
        });
        bVar.s();
        return nm0.y.f85009a;
    }
}
