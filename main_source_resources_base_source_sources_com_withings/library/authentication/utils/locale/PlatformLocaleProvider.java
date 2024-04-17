package com.withings.library.authentication.utils.locale;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformLocaleProvider.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lcom/withings/library/authentication/utils/locale/PlatformLocaleProvider;", "Lcom/withings/library/authentication/utils/locale/LocaleProvider;", "()V", "getLang", "", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlatformLocaleProvider implements LocaleProvider {
    @Override // com.withings.library.authentication.utils.locale.LocaleProvider
    public String getLang() {
        String language = Locale.getDefault().getLanguage();
        u.i(language, "getLanguage(...)");
        return language;
    }
}
