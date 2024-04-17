package com.withings.nervehealth.ui.usecases;

import android.content.Context;
import com.withings.common.compose.component.Status;
import com.withings.nervehealth.ui.models.resources.NeuropathyDiagnosticUIResources;
import j00.d;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: ComputeNerveHealthHeaderUiModelUseCase.kt */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f42779a;

    @Inject
    public a(Context context) {
        this.f42779a = context;
    }

    public final p00.a a(DateTime dateTime) {
        String format = LocalDateTime.ofInstant(Instant.ofEpochMilli(dateTime.getMillis()), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MMM yyyy"));
        u.i(format, "format(...)");
        String upperCase = format.toUpperCase(Locale.ROOT);
        u.i(upperCase, "toUpperCase(...)");
        String string = this.f42779a.getString(NeuropathyDiagnosticUIResources.f42743g.d());
        u.i(string, "getString(...)");
        return new p00.a(upperCase, string, Status.Icon.f33334h);
    }

    public final p00.a b(j00.d dVar) {
        Status.Icon icon;
        String format = LocalDateTime.ofInstant(Instant.ofEpochMilli(dVar.a().getMillis()), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MMM yyyy"));
        u.i(format, "format(...)");
        String upperCase = format.toUpperCase(Locale.ROOT);
        u.i(upperCase, "toUpperCase(...)");
        String string = this.f42779a.getString(ah.u.y(dVar).d());
        u.i(string, "getString(...)");
        if (dVar instanceof d.e) {
            icon = Status.Icon.f33334h;
        } else if (dVar instanceof d.C1111d) {
            icon = Status.Icon.f33327a;
        } else if (dVar instanceof d.a) {
            icon = Status.Icon.f33330d;
        } else {
            icon = Status.Icon.f33328b;
        }
        return new p00.a(upperCase, string, icon);
    }
}
