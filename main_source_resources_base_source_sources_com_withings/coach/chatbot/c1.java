package com.withings.coach.chatbot;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: DecimalDigitsInputFilter.kt */
/* loaded from: classes3.dex */
public final class c1 implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    private Pattern f32979a;

    public c1(int i11) {
        StringBuilder sb2 = new StringBuilder("[0-9]{0,");
        sb2.append(9);
        sb2.append("}+((\\.[0-9]{0,");
        sb2.append(i11 - 1);
        sb2.append("})?)||(\\.)?");
        Pattern compile = Pattern.compile(sb2.toString());
        kotlin.jvm.internal.u.i(compile, "compile(...)");
        this.f32979a = compile;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
        if (spanned == null) {
            return null;
        }
        Matcher matcher = this.f32979a.matcher(spanned);
        kotlin.jvm.internal.u.i(matcher, "matcher(...)");
        if (matcher.matches()) {
            return null;
        }
        return "";
    }
}
