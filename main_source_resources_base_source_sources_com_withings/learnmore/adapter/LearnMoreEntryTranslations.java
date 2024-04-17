package com.withings.learnmore.adapter;

import com.google.firebase.dynamiclinks.DynamicLink;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: LearnMore.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008b\u0001\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\u0006\u0010,\u001a\u00020\u0003J\t\u0010-\u001a\u00020.HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006/"}, d2 = {"Lcom/withings/learnmore/adapter/LearnMoreEntryTranslations;", "", "de", "Lcom/withings/learnmore/adapter/LearnMoreEntry;", "en", "es", "fr", "it", "ja", "ko", "nl", DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT, "ru", "zh", "(Lcom/withings/learnmore/adapter/LearnMoreEntry;Lcom/withings/learnmore/adapter/LearnMoreEntry;Lcom/withings/learnmore/adapter/LearnMoreEntry;Lcom/withings/learnmore/adapter/LearnMoreEntry;Lcom/withings/learnmore/adapter/LearnMoreEntry;Lcom/withings/learnmore/adapter/LearnMoreEntry;Lcom/withings/learnmore/adapter/LearnMoreEntry;Lcom/withings/learnmore/adapter/LearnMoreEntry;Lcom/withings/learnmore/adapter/LearnMoreEntry;Lcom/withings/learnmore/adapter/LearnMoreEntry;Lcom/withings/learnmore/adapter/LearnMoreEntry;)V", "getDe", "()Lcom/withings/learnmore/adapter/LearnMoreEntry;", "getEn", "getEs", "getFr", "getIt", "getJa", "getKo", "getNl", "getPt", "getRu", "getZh", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "languageOrDefault", "toString", "", "learnmore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LearnMoreEntryTranslations {
    public static final int $stable = 0;

    /* renamed from: de  reason: collision with root package name */
    private final LearnMoreEntry f40616de;

    /* renamed from: en  reason: collision with root package name */
    private final LearnMoreEntry f40617en;

    /* renamed from: es  reason: collision with root package name */
    private final LearnMoreEntry f40618es;

    /* renamed from: fr  reason: collision with root package name */
    private final LearnMoreEntry f40619fr;
    private final LearnMoreEntry it;

    /* renamed from: ja  reason: collision with root package name */
    private final LearnMoreEntry f40620ja;

    /* renamed from: ko  reason: collision with root package name */
    private final LearnMoreEntry f40621ko;

    /* renamed from: nl  reason: collision with root package name */
    private final LearnMoreEntry f40622nl;

    /* renamed from: pt  reason: collision with root package name */
    private final LearnMoreEntry f40623pt;

    /* renamed from: ru  reason: collision with root package name */
    private final LearnMoreEntry f40624ru;

    /* renamed from: zh  reason: collision with root package name */
    private final LearnMoreEntry f40625zh;

    public LearnMoreEntryTranslations(LearnMoreEntry learnMoreEntry, LearnMoreEntry en2, LearnMoreEntry learnMoreEntry2, LearnMoreEntry learnMoreEntry3, LearnMoreEntry learnMoreEntry4, LearnMoreEntry learnMoreEntry5, LearnMoreEntry learnMoreEntry6, LearnMoreEntry learnMoreEntry7, LearnMoreEntry learnMoreEntry8, LearnMoreEntry learnMoreEntry9, LearnMoreEntry learnMoreEntry10) {
        u.j(en2, "en");
        this.f40616de = learnMoreEntry;
        this.f40617en = en2;
        this.f40618es = learnMoreEntry2;
        this.f40619fr = learnMoreEntry3;
        this.it = learnMoreEntry4;
        this.f40620ja = learnMoreEntry5;
        this.f40621ko = learnMoreEntry6;
        this.f40622nl = learnMoreEntry7;
        this.f40623pt = learnMoreEntry8;
        this.f40624ru = learnMoreEntry9;
        this.f40625zh = learnMoreEntry10;
    }

    public static /* synthetic */ LearnMoreEntryTranslations copy$default(LearnMoreEntryTranslations learnMoreEntryTranslations, LearnMoreEntry learnMoreEntry, LearnMoreEntry learnMoreEntry2, LearnMoreEntry learnMoreEntry3, LearnMoreEntry learnMoreEntry4, LearnMoreEntry learnMoreEntry5, LearnMoreEntry learnMoreEntry6, LearnMoreEntry learnMoreEntry7, LearnMoreEntry learnMoreEntry8, LearnMoreEntry learnMoreEntry9, LearnMoreEntry learnMoreEntry10, LearnMoreEntry learnMoreEntry11, int i11, Object obj) {
        LearnMoreEntry learnMoreEntry12;
        LearnMoreEntry learnMoreEntry13;
        LearnMoreEntry learnMoreEntry14;
        LearnMoreEntry learnMoreEntry15;
        LearnMoreEntry learnMoreEntry16;
        LearnMoreEntry learnMoreEntry17;
        LearnMoreEntry learnMoreEntry18;
        LearnMoreEntry learnMoreEntry19;
        LearnMoreEntry learnMoreEntry20;
        LearnMoreEntry learnMoreEntry21;
        LearnMoreEntry learnMoreEntry22;
        if ((i11 & 1) != 0) {
            learnMoreEntry12 = learnMoreEntryTranslations.f40616de;
        } else {
            learnMoreEntry12 = learnMoreEntry;
        }
        if ((i11 & 2) != 0) {
            learnMoreEntry13 = learnMoreEntryTranslations.f40617en;
        } else {
            learnMoreEntry13 = learnMoreEntry2;
        }
        if ((i11 & 4) != 0) {
            learnMoreEntry14 = learnMoreEntryTranslations.f40618es;
        } else {
            learnMoreEntry14 = learnMoreEntry3;
        }
        if ((i11 & 8) != 0) {
            learnMoreEntry15 = learnMoreEntryTranslations.f40619fr;
        } else {
            learnMoreEntry15 = learnMoreEntry4;
        }
        if ((i11 & 16) != 0) {
            learnMoreEntry16 = learnMoreEntryTranslations.it;
        } else {
            learnMoreEntry16 = learnMoreEntry5;
        }
        if ((i11 & 32) != 0) {
            learnMoreEntry17 = learnMoreEntryTranslations.f40620ja;
        } else {
            learnMoreEntry17 = learnMoreEntry6;
        }
        if ((i11 & 64) != 0) {
            learnMoreEntry18 = learnMoreEntryTranslations.f40621ko;
        } else {
            learnMoreEntry18 = learnMoreEntry7;
        }
        if ((i11 & 128) != 0) {
            learnMoreEntry19 = learnMoreEntryTranslations.f40622nl;
        } else {
            learnMoreEntry19 = learnMoreEntry8;
        }
        if ((i11 & 256) != 0) {
            learnMoreEntry20 = learnMoreEntryTranslations.f40623pt;
        } else {
            learnMoreEntry20 = learnMoreEntry9;
        }
        if ((i11 & 512) != 0) {
            learnMoreEntry21 = learnMoreEntryTranslations.f40624ru;
        } else {
            learnMoreEntry21 = learnMoreEntry10;
        }
        if ((i11 & 1024) != 0) {
            learnMoreEntry22 = learnMoreEntryTranslations.f40625zh;
        } else {
            learnMoreEntry22 = learnMoreEntry11;
        }
        return learnMoreEntryTranslations.copy(learnMoreEntry12, learnMoreEntry13, learnMoreEntry14, learnMoreEntry15, learnMoreEntry16, learnMoreEntry17, learnMoreEntry18, learnMoreEntry19, learnMoreEntry20, learnMoreEntry21, learnMoreEntry22);
    }

    public final LearnMoreEntry component1() {
        return this.f40616de;
    }

    public final LearnMoreEntry component10() {
        return this.f40624ru;
    }

    public final LearnMoreEntry component11() {
        return this.f40625zh;
    }

    public final LearnMoreEntry component2() {
        return this.f40617en;
    }

    public final LearnMoreEntry component3() {
        return this.f40618es;
    }

    public final LearnMoreEntry component4() {
        return this.f40619fr;
    }

    public final LearnMoreEntry component5() {
        return this.it;
    }

    public final LearnMoreEntry component6() {
        return this.f40620ja;
    }

    public final LearnMoreEntry component7() {
        return this.f40621ko;
    }

    public final LearnMoreEntry component8() {
        return this.f40622nl;
    }

    public final LearnMoreEntry component9() {
        return this.f40623pt;
    }

    public final LearnMoreEntryTranslations copy(LearnMoreEntry learnMoreEntry, LearnMoreEntry en2, LearnMoreEntry learnMoreEntry2, LearnMoreEntry learnMoreEntry3, LearnMoreEntry learnMoreEntry4, LearnMoreEntry learnMoreEntry5, LearnMoreEntry learnMoreEntry6, LearnMoreEntry learnMoreEntry7, LearnMoreEntry learnMoreEntry8, LearnMoreEntry learnMoreEntry9, LearnMoreEntry learnMoreEntry10) {
        u.j(en2, "en");
        return new LearnMoreEntryTranslations(learnMoreEntry, en2, learnMoreEntry2, learnMoreEntry3, learnMoreEntry4, learnMoreEntry5, learnMoreEntry6, learnMoreEntry7, learnMoreEntry8, learnMoreEntry9, learnMoreEntry10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LearnMoreEntryTranslations)) {
            return false;
        }
        LearnMoreEntryTranslations learnMoreEntryTranslations = (LearnMoreEntryTranslations) obj;
        if (u.e(this.f40616de, learnMoreEntryTranslations.f40616de) && u.e(this.f40617en, learnMoreEntryTranslations.f40617en) && u.e(this.f40618es, learnMoreEntryTranslations.f40618es) && u.e(this.f40619fr, learnMoreEntryTranslations.f40619fr) && u.e(this.it, learnMoreEntryTranslations.it) && u.e(this.f40620ja, learnMoreEntryTranslations.f40620ja) && u.e(this.f40621ko, learnMoreEntryTranslations.f40621ko) && u.e(this.f40622nl, learnMoreEntryTranslations.f40622nl) && u.e(this.f40623pt, learnMoreEntryTranslations.f40623pt) && u.e(this.f40624ru, learnMoreEntryTranslations.f40624ru) && u.e(this.f40625zh, learnMoreEntryTranslations.f40625zh)) {
            return true;
        }
        return false;
    }

    public final LearnMoreEntry getDe() {
        return this.f40616de;
    }

    public final LearnMoreEntry getEn() {
        return this.f40617en;
    }

    public final LearnMoreEntry getEs() {
        return this.f40618es;
    }

    public final LearnMoreEntry getFr() {
        return this.f40619fr;
    }

    public final LearnMoreEntry getIt() {
        return this.it;
    }

    public final LearnMoreEntry getJa() {
        return this.f40620ja;
    }

    public final LearnMoreEntry getKo() {
        return this.f40621ko;
    }

    public final LearnMoreEntry getNl() {
        return this.f40622nl;
    }

    public final LearnMoreEntry getPt() {
        return this.f40623pt;
    }

    public final LearnMoreEntry getRu() {
        return this.f40624ru;
    }

    public final LearnMoreEntry getZh() {
        return this.f40625zh;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        LearnMoreEntry learnMoreEntry = this.f40616de;
        int i11 = 0;
        if (learnMoreEntry == null) {
            hashCode = 0;
        } else {
            hashCode = learnMoreEntry.hashCode();
        }
        int hashCode10 = (this.f40617en.hashCode() + (hashCode * 31)) * 31;
        LearnMoreEntry learnMoreEntry2 = this.f40618es;
        if (learnMoreEntry2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = learnMoreEntry2.hashCode();
        }
        int i12 = (hashCode10 + hashCode2) * 31;
        LearnMoreEntry learnMoreEntry3 = this.f40619fr;
        if (learnMoreEntry3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = learnMoreEntry3.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        LearnMoreEntry learnMoreEntry4 = this.it;
        if (learnMoreEntry4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = learnMoreEntry4.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        LearnMoreEntry learnMoreEntry5 = this.f40620ja;
        if (learnMoreEntry5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = learnMoreEntry5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        LearnMoreEntry learnMoreEntry6 = this.f40621ko;
        if (learnMoreEntry6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = learnMoreEntry6.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        LearnMoreEntry learnMoreEntry7 = this.f40622nl;
        if (learnMoreEntry7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = learnMoreEntry7.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        LearnMoreEntry learnMoreEntry8 = this.f40623pt;
        if (learnMoreEntry8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = learnMoreEntry8.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        LearnMoreEntry learnMoreEntry9 = this.f40624ru;
        if (learnMoreEntry9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = learnMoreEntry9.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        LearnMoreEntry learnMoreEntry10 = this.f40625zh;
        if (learnMoreEntry10 != null) {
            i11 = learnMoreEntry10.hashCode();
        }
        return i19 + i11;
    }

    public final LearnMoreEntry languageOrDefault() {
        LearnMoreEntry learnMoreEntry;
        String language = Locale.getDefault().getLanguage();
        u.i(language, "getLanguage(...)");
        Locale locale = Locale.getDefault();
        u.i(locale, "getDefault(...)");
        String lowerCase = language.toLowerCase(locale);
        u.i(lowerCase, "toLowerCase(...)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3201) {
            if (hashCode != 3246) {
                if (hashCode != 3276) {
                    if (hashCode != 3371) {
                        if (hashCode != 3383) {
                            if (hashCode != 3428) {
                                if (hashCode != 3518) {
                                    if (hashCode != 3588) {
                                        if (hashCode != 3651) {
                                            if (hashCode == 3886 && lowerCase.equals("zh")) {
                                                learnMoreEntry = this.f40625zh;
                                            }
                                            learnMoreEntry = this.f40617en;
                                        } else {
                                            if (lowerCase.equals("ru")) {
                                                learnMoreEntry = this.f40624ru;
                                            }
                                            learnMoreEntry = this.f40617en;
                                        }
                                    } else {
                                        if (lowerCase.equals(DynamicLink.ItunesConnectAnalyticsParameters.KEY_ITUNES_CONNECT_PT)) {
                                            learnMoreEntry = this.f40623pt;
                                        }
                                        learnMoreEntry = this.f40617en;
                                    }
                                } else {
                                    if (lowerCase.equals("nl")) {
                                        learnMoreEntry = this.f40622nl;
                                    }
                                    learnMoreEntry = this.f40617en;
                                }
                            } else {
                                if (lowerCase.equals("ko")) {
                                    learnMoreEntry = this.f40621ko;
                                }
                                learnMoreEntry = this.f40617en;
                            }
                        } else {
                            if (lowerCase.equals("ja")) {
                                learnMoreEntry = this.f40620ja;
                            }
                            learnMoreEntry = this.f40617en;
                        }
                    } else {
                        if (lowerCase.equals("it")) {
                            learnMoreEntry = this.it;
                        }
                        learnMoreEntry = this.f40617en;
                    }
                } else {
                    if (lowerCase.equals("fr")) {
                        learnMoreEntry = this.f40619fr;
                    }
                    learnMoreEntry = this.f40617en;
                }
            } else {
                if (lowerCase.equals("es")) {
                    learnMoreEntry = this.f40618es;
                }
                learnMoreEntry = this.f40617en;
            }
        } else {
            if (lowerCase.equals("de")) {
                learnMoreEntry = this.f40616de;
            }
            learnMoreEntry = this.f40617en;
        }
        if (learnMoreEntry == null) {
            return this.f40617en;
        }
        return learnMoreEntry;
    }

    public String toString() {
        LearnMoreEntry learnMoreEntry = this.f40616de;
        LearnMoreEntry learnMoreEntry2 = this.f40617en;
        LearnMoreEntry learnMoreEntry3 = this.f40618es;
        LearnMoreEntry learnMoreEntry4 = this.f40619fr;
        LearnMoreEntry learnMoreEntry5 = this.it;
        LearnMoreEntry learnMoreEntry6 = this.f40620ja;
        LearnMoreEntry learnMoreEntry7 = this.f40621ko;
        LearnMoreEntry learnMoreEntry8 = this.f40622nl;
        LearnMoreEntry learnMoreEntry9 = this.f40623pt;
        LearnMoreEntry learnMoreEntry10 = this.f40624ru;
        LearnMoreEntry learnMoreEntry11 = this.f40625zh;
        return "LearnMoreEntryTranslations(de=" + learnMoreEntry + ", en=" + learnMoreEntry2 + ", es=" + learnMoreEntry3 + ", fr=" + learnMoreEntry4 + ", it=" + learnMoreEntry5 + ", ja=" + learnMoreEntry6 + ", ko=" + learnMoreEntry7 + ", nl=" + learnMoreEntry8 + ", pt=" + learnMoreEntry9 + ", ru=" + learnMoreEntry10 + ", zh=" + learnMoreEntry11 + ")";
    }

    public /* synthetic */ LearnMoreEntryTranslations(LearnMoreEntry learnMoreEntry, LearnMoreEntry learnMoreEntry2, LearnMoreEntry learnMoreEntry3, LearnMoreEntry learnMoreEntry4, LearnMoreEntry learnMoreEntry5, LearnMoreEntry learnMoreEntry6, LearnMoreEntry learnMoreEntry7, LearnMoreEntry learnMoreEntry8, LearnMoreEntry learnMoreEntry9, LearnMoreEntry learnMoreEntry10, LearnMoreEntry learnMoreEntry11, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : learnMoreEntry, learnMoreEntry2, (i11 & 4) != 0 ? null : learnMoreEntry3, (i11 & 8) != 0 ? null : learnMoreEntry4, (i11 & 16) != 0 ? null : learnMoreEntry5, (i11 & 32) != 0 ? null : learnMoreEntry6, (i11 & 64) != 0 ? null : learnMoreEntry7, (i11 & 128) != 0 ? null : learnMoreEntry8, (i11 & 256) != 0 ? null : learnMoreEntry9, (i11 & 512) != 0 ? null : learnMoreEntry10, (i11 & 1024) != 0 ? null : learnMoreEntry11);
    }
}
