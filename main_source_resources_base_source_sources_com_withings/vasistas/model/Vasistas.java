package com.withings.vasistas.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import androidx.camera.core.y1;
import androidx.compose.material.o;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.util.log.Fail;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import sm0.a;
import x70.b;
/* compiled from: Vasistas.kt */
@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0003\bª\u0001\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 Ü\u00012\u00020\u0001:\bÚ\u0001Û\u0001Ü\u0001Ý\u0001BÓ\u0003\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010*\u001a\u00020+\u0012\b\b\u0002\u0010,\u001a\u00020\b\u0012\b\b\u0002\u0010-\u001a\u00020\b\u0012\b\b\u0002\u0010.\u001a\u00020\b\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u00103\u001a\u00020+\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u00105J\t\u0010¦\u0001\u001a\u00020\u0000H\u0016J\n\u0010§\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010©\u0001\u001a\u00020\bHÆ\u0003J\n\u0010ª\u0001\u001a\u00020\bHÆ\u0003J\n\u0010«\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¬\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\bHÆ\u0003J\n\u0010®\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010°\u0001\u001a\u00020\bHÆ\u0003J\n\u0010±\u0001\u001a\u00020\bHÆ\u0003J\u0011\u0010²\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010yJ\n\u0010³\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010´\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¶\u0001\u001a\u00020\bHÆ\u0003J\n\u0010·\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¸\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¹\u0001\u001a\u00020\bHÆ\u0003J\n\u0010º\u0001\u001a\u00020\bHÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0005HÆ\u0003J\u0011\u0010¼\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010½\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010yJ\u0011\u0010¾\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010¿\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010À\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010Á\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\n\u0010Â\u0001\u001a\u00020+HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Å\u0001\u001a\u00020\bHÆ\u0003J\u0011\u0010Æ\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010Ç\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\n\u0010È\u0001\u001a\u00020\bHÆ\u0003J\u0011\u0010É\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\u0011\u0010Ê\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\n\u0010Ë\u0001\u001a\u00020+HÆ\u0003J\u0011\u0010Ì\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010AJ\f\u0010Í\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010Î\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010Ï\u0001\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0010HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0010HÆ\u0003JÜ\u0003\u0010Ò\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\u00102\b\b\u0002\u0010\u001d\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\b2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\b2\b\b\u0002\u00103\u001a\u00020+2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0003\u0010Ó\u0001J\u0016\u0010Ô\u0001\u001a\u00020+2\n\u0010Õ\u0001\u001a\u0005\u0018\u00010Ö\u0001HÖ\u0003J\n\u0010×\u0001\u001a\u00020\bHÖ\u0001J\u000b\u0010Ø\u0001\u001a\u00030Ù\u0001HÖ\u0001R\u001a\u0010!\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u001a\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00107\"\u0004\b;\u00109R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010/\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001e\u0010%\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\bE\u0010A\"\u0004\bF\u0010CR\u001e\u00101\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\bG\u0010A\"\u0004\bH\u0010CR\u001e\u00102\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\bI\u0010A\"\u0004\bJ\u0010CR$\u0010L\u001a\u00020\u00102\u0006\u0010K\u001a\u00020\u0010@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001e\u00104\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\bQ\u0010A\"\u0004\bR\u0010CR\u001e\u0010&\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\bS\u0010A\"\u0004\bT\u0010CR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010N\"\u0004\bV\u0010PR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010\u001d\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010N\"\u0004\b\\\u0010PR\u001a\u0010\u0019\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010N\"\u0004\b^\u0010PR\u001a\u0010$\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u001a\u0010 \u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u00107\"\u0004\bd\u00109R\u001a\u0010\u001c\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010N\"\u0004\bf\u0010PR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u00107\"\u0004\bh\u00109R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010N\"\u0004\bj\u0010PR\u0011\u0010k\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001e\u00100\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\bn\u0010A\"\u0004\bo\u0010CR\u001a\u0010\u0016\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u00107\"\u0004\bq\u00109R\u001a\u0010\u0017\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u00107\"\u0004\bs\u00109R\u001a\u0010-\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u00107\"\u0004\bu\u00109R\u001a\u0010.\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u00107\"\u0004\bw\u00109R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010|\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u001a\u0010*\u001a\u00020+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010}\"\u0004\b~\u0010\u007fR\u001b\u00103\u001a\u00020+X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b3\u0010}\"\u0005\b\u0080\u0001\u0010\u007fR\u001c\u0010\u0012\u001a\u00020\u0010X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010N\"\u0005\b\u0082\u0001\u0010PR \u0010'\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010D\u001a\u0005\b\u0083\u0001\u0010A\"\u0005\b\u0084\u0001\u0010CR\u001c\u0010,\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u00107\"\u0005\b\u0086\u0001\u00109R\u001c\u0010\u0018\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u00107\"\u0005\b\u0088\u0001\u00109R\u001c\u0010\u0014\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u00107\"\u0005\b\u008a\u0001\u00109R\u001c\u0010\u0013\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u00107\"\u0005\b\u008c\u0001\u00109R\u001c\u0010\u0015\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u00107\"\u0005\b\u008e\u0001\u00109R \u0010(\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010D\u001a\u0005\b\u008f\u0001\u0010A\"\u0005\b\u0090\u0001\u0010CR \u0010)\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0012\n\u0002\u0010D\u001a\u0005\b\u0091\u0001\u0010A\"\u0005\b\u0092\u0001\u0010CR\u001d\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0011\n\u0000\u001a\u0005\b\u0093\u0001\u0010m\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001c\u0010\u001b\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0096\u0001\u00107\"\u0005\b\u0097\u0001\u00109R\u001c\u0010\u001f\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0098\u0001\u00107\"\u0005\b\u0099\u0001\u00109R\u001c\u0010\u001e\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u00107\"\u0005\b\u009b\u0001\u00109R\u001c\u0010#\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009c\u0001\u00107\"\u0005\b\u009d\u0001\u00109R \u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0012\n\u0002\u0010|\u001a\u0005\b¢\u0001\u0010y\"\u0005\b£\u0001\u0010{R\u001c\u0010\"\u001a\u00020\bX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¤\u0001\u00107\"\u0005\b¥\u0001\u00109¨\u0006Þ\u0001"}, d2 = {"Lcom/withings/vasistas/model/Vasistas;", "", "startDate", "Lorg/joda/time/DateTime;", "id", "", NavigationArguments.USER_ID, "durationMillis", "", "type", "Lcom/withings/vasistas/model/Vasistas$VasistasType;", "activityType", "Lcom/withings/vasistas/model/Vasistas$ActivityType;", "category", "Lcom/withings/vasistas/model/Vasistas$Category;", "calories", "", "earnedCalories", "met", "sleepLevel", "sleepDebug", "snoringDurationRatio", "heartRate", "heartRateMeasureQuality", "skinTemperature", "coreTemperature", "activityStatus", "steps", "distance", "classifierFeature", "swimMovements", "swimLaps", "deviceModel", "activityRecognitionData2", "version", "swimType", "deviceId", "apneaHypopneaIndex", "breathingProbability", "pauseType", "spo2", "spo2Quality", "isSyncedToWs", "", "respiratoryRate", "hrLevel", "hrState", "algoVersion", "firmwareVersion", "appPfmId", "appliVersion", "isTrusted", "attrib", "(Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;ILcom/withings/vasistas/model/Vasistas$VasistasType;Lcom/withings/vasistas/model/Vasistas$ActivityType;Lcom/withings/vasistas/model/Vasistas$Category;FFFIIIIIIFIIFFIIIIIIJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;)V", "getActivityRecognitionData2", "()I", "setActivityRecognitionData2", "(I)V", "getActivityStatus", "setActivityStatus", "getActivityType", "()Lcom/withings/vasistas/model/Vasistas$ActivityType;", "setActivityType", "(Lcom/withings/vasistas/model/Vasistas$ActivityType;)V", "getAlgoVersion", "()Ljava/lang/Integer;", "setAlgoVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getApneaHypopneaIndex", "setApneaHypopneaIndex", "getAppPfmId", "setAppPfmId", "getAppliVersion", "setAppliVersion", "value", "ascent", "getAscent", "()F", "setAscent", "(F)V", "getAttrib", "setAttrib", "getBreathingProbability", "setBreathingProbability", "getCalories", "setCalories", "getCategory", "()Lcom/withings/vasistas/model/Vasistas$Category;", "setCategory", "(Lcom/withings/vasistas/model/Vasistas$Category;)V", "getClassifierFeature", "setClassifierFeature", "getCoreTemperature", "setCoreTemperature", "getDeviceId", "()J", "setDeviceId", "(J)V", "getDeviceModel", "setDeviceModel", "getDistance", "setDistance", "getDurationMillis", "setDurationMillis", "getEarnedCalories", "setEarnedCalories", "end", "getEnd", "()Lorg/joda/time/DateTime;", "getFirmwareVersion", "setFirmwareVersion", "getHeartRate", "setHeartRate", "getHeartRateMeasureQuality", "setHeartRateMeasureQuality", "getHrLevel", "setHrLevel", "getHrState", "setHrState", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "()Z", "setSyncedToWs", "(Z)V", "setTrusted", "getMet", "setMet", "getPauseType", "setPauseType", "getRespiratoryRate", "setRespiratoryRate", "getSkinTemperature", "setSkinTemperature", "getSleepDebug", "setSleepDebug", "getSleepLevel", "setSleepLevel", "getSnoringDurationRatio", "setSnoringDurationRatio", "getSpo2", "setSpo2", "getSpo2Quality", "setSpo2Quality", "getStartDate", "setStartDate", "(Lorg/joda/time/DateTime;)V", "getSteps", "setSteps", "getSwimLaps", "setSwimLaps", "getSwimMovements", "setSwimMovements", "getSwimType", "setSwimType", "getType", "()Lcom/withings/vasistas/model/Vasistas$VasistasType;", "setType", "(Lcom/withings/vasistas/model/Vasistas$VasistasType;)V", "getUserId", "setUserId", "getVersion", "setVersion", "clone", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component5", "component6", "component7", "component8", "component9", "copy", "(Lorg/joda/time/DateTime;Ljava/lang/Long;Ljava/lang/Long;ILcom/withings/vasistas/model/Vasistas$VasistasType;Lcom/withings/vasistas/model/Vasistas$ActivityType;Lcom/withings/vasistas/model/Vasistas$Category;FFFIIIIIIFIIFFIIIIIIJLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZIIILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;)Lcom/withings/vasistas/model/Vasistas;", "equals", "other", "", "hashCode", "toString", "", "ActivityType", "Category", "Companion", "VasistasType", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Vasistas implements Cloneable {
    private static final int CATEGORY_VALUE_AHI = -20;
    public static final int CATEGORY_VALUE_BODY = -16;
    private static final int CATEGORY_VALUE_CORE_TEMPERATURE = -22;
    private static final int CATEGORY_VALUE_ELEVATION = -21;
    private static final int CATEGORY_VALUE_PAUSE = -18;
    private static final int CATEGORY_VALUE_SPO2 = -19;
    private static final int CATEGORY_VALUE_SWIM = -17;
    public static final Companion Companion = new Companion(null);
    private static final int DATABASE_ID_AHI = 5;
    private static final int DATABASE_ID_DAY = 0;
    private static final int DATABASE_ID_ELEVATION = 6;
    private static final int DATABASE_ID_EMPTY = 1;
    private static final int DATABASE_ID_SLEEP = 2;
    private static final int DATABASE_ID_SPO2 = 4;
    private static final int DATABASE_ID_SWIM = 3;
    private int activityRecognitionData2;
    private int activityStatus;
    private ActivityType activityType;
    private Integer algoVersion;
    private Integer apneaHypopneaIndex;
    private Integer appPfmId;
    private Integer appliVersion;
    private float ascent;
    private Integer attrib;
    private Integer breathingProbability;
    private float calories;
    private Category category;
    private float classifierFeature;
    private float coreTemperature;
    private long deviceId;
    private int deviceModel;
    private float distance;
    private int durationMillis;
    private float earnedCalories;
    private Integer firmwareVersion;
    private int heartRate;
    private int heartRateMeasureQuality;
    private int hrLevel;
    private int hrState;

    /* renamed from: id  reason: collision with root package name */
    private Long f46386id;
    private boolean isSyncedToWs;
    private boolean isTrusted;
    private float met;
    private Integer pauseType;
    private int respiratoryRate;
    private int skinTemperature;
    private int sleepDebug;
    private int sleepLevel;
    private int snoringDurationRatio;
    private Integer spo2;
    private Integer spo2Quality;
    private DateTime startDate;
    private int steps;
    private int swimLaps;
    private int swimMovements;
    private int swimType;
    private VasistasType type;
    private Long userId;
    private int version;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Vasistas.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$ActivityType;", "", "wsValue", "", "(Ljava/lang/String;II)V", "getWsValue", "()I", "IDLE", "WALK", "RUN", "SWIM", "Companion", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ActivityType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ActivityType[] $VALUES;
        public static final Companion Companion;
        private final int wsValue;
        public static final ActivityType IDLE = new ActivityType("IDLE", 0, 0);
        public static final ActivityType WALK = new ActivityType("WALK", 1, 1);
        public static final ActivityType RUN = new ActivityType("RUN", 2, 2);
        public static final ActivityType SWIM = new ActivityType("SWIM", 3, 9);

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$ActivityType$Companion;", "", "()V", "fromWsValue", "Lcom/withings/vasistas/model/Vasistas$ActivityType;", "wsValue", "", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            public final ActivityType fromWsValue(int i11) {
                Object obj;
                Iterator<E> it = ActivityType.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ActivityType) obj).getWsValue() == i11) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ActivityType activityType = (ActivityType) obj;
                if (activityType == null) {
                    b.t(ActivityType.class, "Unrecognized vasistas activity type from webservices : %d", Integer.valueOf(i11));
                    return ActivityType.WALK;
                }
                return activityType;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ ActivityType[] $values() {
            return new ActivityType[]{IDLE, WALK, RUN, SWIM};
        }

        static {
            ActivityType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = sm0.b.a($values);
            Companion = new Companion(null);
        }

        private ActivityType(String str, int i11, int i12) {
            this.wsValue = i12;
        }

        public static final ActivityType fromWsValue(int i11) {
            return Companion.fromWsValue(i11);
        }

        public static a<ActivityType> getEntries() {
            return $ENTRIES;
        }

        public static ActivityType valueOf(String str) {
            return (ActivityType) Enum.valueOf(ActivityType.class, str);
        }

        public static ActivityType[] values() {
            return (ActivityType[]) $VALUES.clone();
        }

        public final int getWsValue() {
            return this.wsValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Vasistas.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\b\u001a\u00020\u0006H&j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category;", "", "(Ljava/lang/String;I)V", "geDeviceType", "", "getMeasureTypes", "", "getValue", "getWsValue", "BED", "MOTION", "ELEVATION", "BODY", "SWIM", "PAUSE", "SPO2", "AHI", "CORE_TEMPERATURE", "Companion", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Category {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Category[] $VALUES;
        public static final Companion Companion;
        public static final Category BED = new BED("BED", 0);
        public static final Category MOTION = new MOTION("MOTION", 1);
        public static final Category ELEVATION = new ELEVATION("ELEVATION", 2);
        public static final Category BODY = new BODY("BODY", 3);
        public static final Category SWIM = new SWIM("SWIM", 4);
        public static final Category PAUSE = new PAUSE("PAUSE", 5);
        public static final Category SPO2 = new SPO2("SPO2", 6);
        public static final Category AHI = new AHI("AHI", 7);
        public static final Category CORE_TEMPERATURE = new CORE_TEMPERATURE("CORE_TEMPERATURE", 8);

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category$AHI;", "Lcom/withings/vasistas/model/Vasistas$Category;", "geDeviceType", "", "getMeasureTypes", "", "getValue", "getWsValue", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        static final class AHI extends Category {
            AHI(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int geDeviceType() {
                return 16;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getMeasureTypes() {
                return x.R(x.W(43, Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX), Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY)), ",", null, null, null, 62);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int getValue() {
                return -20;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getWsValue() {
                return "apnea";
            }
        }

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category$BED;", "Lcom/withings/vasistas/model/Vasistas$Category;", "geDeviceType", "", "getMeasureTypes", "", "getValue", "getWsValue", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        static final class BED extends Category {
            BED(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int geDeviceType() {
                return 32;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getMeasureTypes() {
                return x.R(x.W(11, 39, 41, 43, 44, 87, 121, Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_BREATHING_EVENT_PROBABILITY), Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX), 57), ",", null, null, null, 62);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int getValue() {
                return 32;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getWsValue() {
                return ConstantsWs.VASISTAS_CATEGORY_BED;
            }
        }

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category$BODY;", "Lcom/withings/vasistas/model/Vasistas$Category;", "geDeviceType", "", "getMeasureTypes", "", "getValue", "getWsValue", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        static final class BODY extends Category {
            BODY(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int geDeviceType() {
                return 16;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getMeasureTypes() {
                return x.R(x.W(11, 43, 73, Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_HR_LEVEL), Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_HR_STATE)), ",", null, null, null, 62);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int getValue() {
                return -16;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getWsValue() {
                return "hr";
            }
        }

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category$CORE_TEMPERATURE;", "Lcom/withings/vasistas/model/Vasistas$Category;", "geDeviceType", "", "getMeasureTypes", "", "getValue", "getWsValue", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        static final class CORE_TEMPERATURE extends Category {
            CORE_TEMPERATURE(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int geDeviceType() {
                return 16;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getMeasureTypes() {
                return x.R(x.W(43, 208), ",", null, null, null, 62);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int getValue() {
                return Vasistas.CATEGORY_VALUE_CORE_TEMPERATURE;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getWsValue() {
                return ConstantsWs.VASISTAS_CATEGORY_CORE_BODY_TEMPERATURE;
            }
        }

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category$Companion;", "", "()V", "fromDeviceType", "Lcom/withings/vasistas/model/Vasistas$Category;", "deviceType", "", "fromValue", "value", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            public final Category fromDeviceType(int i11) {
                Object obj;
                Iterator<E> it = Category.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Category) obj).getValue() == i11) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Category category = (Category) obj;
                if (category == null) {
                    if (!x.W(0, 1002, 1005).contains(Integer.valueOf(i11))) {
                        Fail.j("Unrecognized vasistas category");
                    }
                    return Category.MOTION;
                }
                return category;
            }

            public final Category fromValue(int i11) {
                Object obj;
                Iterator<E> it = Category.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Category) obj).getValue() == i11) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Category) obj;
            }

            private Companion() {
            }
        }

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category$ELEVATION;", "Lcom/withings/vasistas/model/Vasistas$Category;", "geDeviceType", "", "getMeasureTypes", "", "getValue", "getWsValue", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        static final class ELEVATION extends Category {
            ELEVATION(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int geDeviceType() {
                return 16;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getMeasureTypes() {
                return x.R(x.W(37, 43), ",", null, null, null, 62);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int getValue() {
                return Vasistas.CATEGORY_VALUE_ELEVATION;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getWsValue() {
                return "elevation";
            }
        }

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category$MOTION;", "Lcom/withings/vasistas/model/Vasistas$Category;", "geDeviceType", "", "getMeasureTypes", "", "getValue", "getWsValue", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        static final class MOTION extends Category {
            MOTION(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int geDeviceType() {
                return 16;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getMeasureTypes() {
                return x.R(x.W(36, 39, 40, 37, 41, 42, 43, 44, 59, 70, 87, 90, 120), ",", null, null, null, 62);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int getValue() {
                return 16;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getWsValue() {
                return ConstantsWs.VASISTAS_CATEGORY_TRACKER;
            }
        }

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category$PAUSE;", "Lcom/withings/vasistas/model/Vasistas$Category;", "geDeviceType", "", "getMeasureTypes", "", "getValue", "getWsValue", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        static final class PAUSE extends Category {
            PAUSE(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int geDeviceType() {
                return 16;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getMeasureTypes() {
                return x.R(x.W(43, Integer.valueOf((int) ConstantsWs.MEASURE_TYPE_PAUSE)), ",", null, null, null, 62);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int getValue() {
                return Vasistas.CATEGORY_VALUE_PAUSE;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getWsValue() {
                return ConstantsWs.VASISTAS_CATEGORY_PAUSE;
            }
        }

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category$SPO2;", "Lcom/withings/vasistas/model/Vasistas$Category;", "geDeviceType", "", "getMeasureTypes", "", "getValue", "getWsValue", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        static final class SPO2 extends Category {
            SPO2(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int geDeviceType() {
                return 16;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getMeasureTypes() {
                return x.R(x.W(43, 89, 54), ",", null, null, null, 62);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int getValue() {
                return Vasistas.CATEGORY_VALUE_SPO2;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getWsValue() {
                return "spo2";
            }
        }

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Category$SWIM;", "Lcom/withings/vasistas/model/Vasistas$Category;", "geDeviceType", "", "getMeasureTypes", "", "getValue", "getWsValue", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        static final class SWIM extends Category {
            SWIM(String str, int i11) {
                super(str, i11, null);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int geDeviceType() {
                return 16;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getMeasureTypes() {
                return x.R(x.W(42, 43, 59, 70), ",", null, null, null, 62);
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public int getValue() {
                return Vasistas.CATEGORY_VALUE_SWIM;
            }

            @Override // com.withings.vasistas.model.Vasistas.Category
            public String getWsValue() {
                return ConstantsWs.VASISTAS_CATEGORY_SWIM;
            }
        }

        private static final /* synthetic */ Category[] $values() {
            return new Category[]{BED, MOTION, ELEVATION, BODY, SWIM, PAUSE, SPO2, AHI, CORE_TEMPERATURE};
        }

        static {
            Category[] $values = $values();
            $VALUES = $values;
            $ENTRIES = sm0.b.a($values);
            Companion = new Companion(null);
        }

        public /* synthetic */ Category(String str, int i11, m mVar) {
            this(str, i11);
        }

        public static final Category fromDeviceType(int i11) {
            return Companion.fromDeviceType(i11);
        }

        public static a<Category> getEntries() {
            return $ENTRIES;
        }

        public static Category valueOf(String str) {
            return (Category) Enum.valueOf(Category.class, str);
        }

        public static Category[] values() {
            return (Category[]) $VALUES.clone();
        }

        public abstract int geDeviceType();

        public abstract String getMeasureTypes();

        public abstract int getValue();

        public abstract String getWsValue();

        private Category(String str, int i11) {
        }
    }

    /* compiled from: Vasistas.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0002R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$Companion;", "", "()V", "CATEGORY_VALUE_AHI", "", "CATEGORY_VALUE_BODY", "getCATEGORY_VALUE_BODY$annotations", "CATEGORY_VALUE_CORE_TEMPERATURE", "CATEGORY_VALUE_ELEVATION", "CATEGORY_VALUE_PAUSE", "CATEGORY_VALUE_SPO2", "CATEGORY_VALUE_SWIM", "DATABASE_ID_AHI", "DATABASE_ID_DAY", "DATABASE_ID_ELEVATION", "DATABASE_ID_EMPTY", "DATABASE_ID_SLEEP", "DATABASE_ID_SPO2", "DATABASE_ID_SWIM", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void getCATEGORY_VALUE_BODY$annotations() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Vasistas.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$VasistasType;", "", "databaseID", "", "(Ljava/lang/String;II)V", "getDatabaseID", "()I", "DAY", "EMPTY", "SLEEP", "SWIM", "SPO2", "AHI", "ELEVATION", "Companion", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class VasistasType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ VasistasType[] $VALUES;
        public static final Companion Companion;
        private final int databaseID;
        public static final VasistasType DAY = new VasistasType("DAY", 0, 0);
        public static final VasistasType EMPTY = new VasistasType("EMPTY", 1, 1);
        public static final VasistasType SLEEP = new VasistasType("SLEEP", 2, 2);
        public static final VasistasType SWIM = new VasistasType("SWIM", 3, 3);
        public static final VasistasType SPO2 = new VasistasType("SPO2", 4, 4);
        public static final VasistasType AHI = new VasistasType("AHI", 5, 5);
        public static final VasistasType ELEVATION = new VasistasType("ELEVATION", 6, 6);

        /* compiled from: Vasistas.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/withings/vasistas/model/Vasistas$VasistasType$Companion;", "", "()V", "fromDatabaseID", "Lcom/withings/vasistas/model/Vasistas$VasistasType;", "databaseID", "", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            public /* synthetic */ Companion(m mVar) {
                this();
            }

            public final VasistasType fromDatabaseID(int i11) {
                Object obj;
                Iterator<E> it = VasistasType.getEntries().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((VasistasType) obj).getDatabaseID() == i11) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (VasistasType) obj;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ VasistasType[] $values() {
            return new VasistasType[]{DAY, EMPTY, SLEEP, SWIM, SPO2, AHI, ELEVATION};
        }

        static {
            VasistasType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = sm0.b.a($values);
            Companion = new Companion(null);
        }

        private VasistasType(String str, int i11, int i12) {
            this.databaseID = i12;
        }

        public static final VasistasType fromDatabaseID(int i11) {
            return Companion.fromDatabaseID(i11);
        }

        public static a<VasistasType> getEntries() {
            return $ENTRIES;
        }

        public static VasistasType valueOf(String str) {
            return (VasistasType) Enum.valueOf(VasistasType.class, str);
        }

        public static VasistasType[] values() {
            return (VasistasType[]) $VALUES.clone();
        }

        public final int getDatabaseID() {
            return this.databaseID;
        }
    }

    public Vasistas() {
        this(null, null, null, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -1, 2047, null);
    }

    public final DateTime component1() {
        return this.startDate;
    }

    public final float component10() {
        return this.met;
    }

    public final int component11() {
        return this.sleepLevel;
    }

    public final int component12() {
        return this.sleepDebug;
    }

    public final int component13() {
        return this.snoringDurationRatio;
    }

    public final int component14() {
        return this.heartRate;
    }

    public final int component15() {
        return this.heartRateMeasureQuality;
    }

    public final int component16() {
        return this.skinTemperature;
    }

    public final float component17() {
        return this.coreTemperature;
    }

    public final int component18() {
        return this.activityStatus;
    }

    public final int component19() {
        return this.steps;
    }

    public final Long component2() {
        return this.f46386id;
    }

    public final float component20() {
        return this.distance;
    }

    public final float component21() {
        return this.classifierFeature;
    }

    public final int component22() {
        return this.swimMovements;
    }

    public final int component23() {
        return this.swimLaps;
    }

    public final int component24() {
        return this.deviceModel;
    }

    public final int component25() {
        return this.activityRecognitionData2;
    }

    public final int component26() {
        return this.version;
    }

    public final int component27() {
        return this.swimType;
    }

    public final long component28() {
        return this.deviceId;
    }

    public final Integer component29() {
        return this.apneaHypopneaIndex;
    }

    public final Long component3() {
        return this.userId;
    }

    public final Integer component30() {
        return this.breathingProbability;
    }

    public final Integer component31() {
        return this.pauseType;
    }

    public final Integer component32() {
        return this.spo2;
    }

    public final Integer component33() {
        return this.spo2Quality;
    }

    public final boolean component34() {
        return this.isSyncedToWs;
    }

    public final int component35() {
        return this.respiratoryRate;
    }

    public final int component36() {
        return this.hrLevel;
    }

    public final int component37() {
        return this.hrState;
    }

    public final Integer component38() {
        return this.algoVersion;
    }

    public final Integer component39() {
        return this.firmwareVersion;
    }

    public final int component4() {
        return this.durationMillis;
    }

    public final Integer component40() {
        return this.appPfmId;
    }

    public final Integer component41() {
        return this.appliVersion;
    }

    public final boolean component42() {
        return this.isTrusted;
    }

    public final Integer component43() {
        return this.attrib;
    }

    public final VasistasType component5() {
        return this.type;
    }

    public final ActivityType component6() {
        return this.activityType;
    }

    public final Category component7() {
        return this.category;
    }

    public final float component8() {
        return this.calories;
    }

    public final float component9() {
        return this.earnedCalories;
    }

    public final Vasistas copy(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5, int i27, int i28, int i29, Integer num6, Integer num7, Integer num8, Integer num9, boolean z11, Integer num10) {
        u.j(startDate, "startDate");
        return new Vasistas(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, z5, i27, i28, i29, num6, num7, num8, num9, z11, num10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vasistas)) {
            return false;
        }
        Vasistas vasistas = (Vasistas) obj;
        if (u.e(this.startDate, vasistas.startDate) && u.e(this.f46386id, vasistas.f46386id) && u.e(this.userId, vasistas.userId) && this.durationMillis == vasistas.durationMillis && this.type == vasistas.type && this.activityType == vasistas.activityType && this.category == vasistas.category && Float.compare(this.calories, vasistas.calories) == 0 && Float.compare(this.earnedCalories, vasistas.earnedCalories) == 0 && Float.compare(this.met, vasistas.met) == 0 && this.sleepLevel == vasistas.sleepLevel && this.sleepDebug == vasistas.sleepDebug && this.snoringDurationRatio == vasistas.snoringDurationRatio && this.heartRate == vasistas.heartRate && this.heartRateMeasureQuality == vasistas.heartRateMeasureQuality && this.skinTemperature == vasistas.skinTemperature && Float.compare(this.coreTemperature, vasistas.coreTemperature) == 0 && this.activityStatus == vasistas.activityStatus && this.steps == vasistas.steps && Float.compare(this.distance, vasistas.distance) == 0 && Float.compare(this.classifierFeature, vasistas.classifierFeature) == 0 && this.swimMovements == vasistas.swimMovements && this.swimLaps == vasistas.swimLaps && this.deviceModel == vasistas.deviceModel && this.activityRecognitionData2 == vasistas.activityRecognitionData2 && this.version == vasistas.version && this.swimType == vasistas.swimType && this.deviceId == vasistas.deviceId && u.e(this.apneaHypopneaIndex, vasistas.apneaHypopneaIndex) && u.e(this.breathingProbability, vasistas.breathingProbability) && u.e(this.pauseType, vasistas.pauseType) && u.e(this.spo2, vasistas.spo2) && u.e(this.spo2Quality, vasistas.spo2Quality) && this.isSyncedToWs == vasistas.isSyncedToWs && this.respiratoryRate == vasistas.respiratoryRate && this.hrLevel == vasistas.hrLevel && this.hrState == vasistas.hrState && u.e(this.algoVersion, vasistas.algoVersion) && u.e(this.firmwareVersion, vasistas.firmwareVersion) && u.e(this.appPfmId, vasistas.appPfmId) && u.e(this.appliVersion, vasistas.appliVersion) && this.isTrusted == vasistas.isTrusted && u.e(this.attrib, vasistas.attrib)) {
            return true;
        }
        return false;
    }

    public final int getActivityRecognitionData2() {
        return this.activityRecognitionData2;
    }

    public final int getActivityStatus() {
        return this.activityStatus;
    }

    public final ActivityType getActivityType() {
        return this.activityType;
    }

    public final Integer getAlgoVersion() {
        return this.algoVersion;
    }

    public final Integer getApneaHypopneaIndex() {
        return this.apneaHypopneaIndex;
    }

    public final Integer getAppPfmId() {
        return this.appPfmId;
    }

    public final Integer getAppliVersion() {
        return this.appliVersion;
    }

    public final float getAscent() {
        return this.ascent;
    }

    public final Integer getAttrib() {
        return this.attrib;
    }

    public final Integer getBreathingProbability() {
        return this.breathingProbability;
    }

    public final float getCalories() {
        return this.calories;
    }

    public final Category getCategory() {
        return this.category;
    }

    public final float getClassifierFeature() {
        return this.classifierFeature;
    }

    public final float getCoreTemperature() {
        return this.coreTemperature;
    }

    public final long getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceModel() {
        return this.deviceModel;
    }

    public final float getDistance() {
        return this.distance;
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final float getEarnedCalories() {
        return this.earnedCalories;
    }

    public final DateTime getEnd() {
        DateTime plusMillis = this.startDate.plusMillis(this.durationMillis);
        if (plusMillis == null) {
            return new DateTime(0L);
        }
        return plusMillis;
    }

    public final Integer getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getHeartRateMeasureQuality() {
        return this.heartRateMeasureQuality;
    }

    public final int getHrLevel() {
        return this.hrLevel;
    }

    public final int getHrState() {
        return this.hrState;
    }

    public final Long getId() {
        return this.f46386id;
    }

    public final float getMet() {
        return this.met;
    }

    public final Integer getPauseType() {
        return this.pauseType;
    }

    public final int getRespiratoryRate() {
        return this.respiratoryRate;
    }

    public final int getSkinTemperature() {
        return this.skinTemperature;
    }

    public final int getSleepDebug() {
        return this.sleepDebug;
    }

    public final int getSleepLevel() {
        return this.sleepLevel;
    }

    public final int getSnoringDurationRatio() {
        return this.snoringDurationRatio;
    }

    public final Integer getSpo2() {
        return this.spo2;
    }

    public final Integer getSpo2Quality() {
        return this.spo2Quality;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final int getSwimLaps() {
        return this.swimLaps;
    }

    public final int getSwimMovements() {
        return this.swimMovements;
    }

    public final int getSwimType() {
        return this.swimType;
    }

    public final VasistasType getType() {
        return this.type;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public final int getVersion() {
        return this.version;
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
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15 = this.startDate.hashCode() * 31;
        Long l5 = this.f46386id;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (hashCode15 + hashCode) * 31;
        Long l6 = this.userId;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int a11 = h.a(this.durationMillis, (i12 + hashCode2) * 31, 31);
        VasistasType vasistasType = this.type;
        if (vasistasType == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = vasistasType.hashCode();
        }
        int i13 = (a11 + hashCode3) * 31;
        ActivityType activityType = this.activityType;
        if (activityType == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = activityType.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Category category = this.category;
        if (category == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = category.hashCode();
        }
        int a12 = c.a(this.deviceId, h.a(this.swimType, h.a(this.version, h.a(this.activityRecognitionData2, h.a(this.deviceModel, h.a(this.swimLaps, h.a(this.swimMovements, o.a(this.classifierFeature, o.a(this.distance, h.a(this.steps, h.a(this.activityStatus, o.a(this.coreTemperature, h.a(this.skinTemperature, h.a(this.heartRateMeasureQuality, h.a(this.heartRate, h.a(this.snoringDurationRatio, h.a(this.sleepDebug, h.a(this.sleepLevel, o.a(this.met, o.a(this.earnedCalories, o.a(this.calories, (i14 + hashCode5) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        Integer num = this.apneaHypopneaIndex;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i15 = (a12 + hashCode6) * 31;
        Integer num2 = this.breathingProbability;
        if (num2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num2.hashCode();
        }
        int i16 = (i15 + hashCode7) * 31;
        Integer num3 = this.pauseType;
        if (num3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num3.hashCode();
        }
        int i17 = (i16 + hashCode8) * 31;
        Integer num4 = this.spo2;
        if (num4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num4.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        Integer num5 = this.spo2Quality;
        if (num5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num5.hashCode();
        }
        int a13 = h.a(this.hrState, h.a(this.hrLevel, h.a(this.respiratoryRate, y1.a(this.isSyncedToWs, (i18 + hashCode10) * 31, 31), 31), 31), 31);
        Integer num6 = this.algoVersion;
        if (num6 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = num6.hashCode();
        }
        int i19 = (a13 + hashCode11) * 31;
        Integer num7 = this.firmwareVersion;
        if (num7 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num7.hashCode();
        }
        int i21 = (i19 + hashCode12) * 31;
        Integer num8 = this.appPfmId;
        if (num8 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = num8.hashCode();
        }
        int i22 = (i21 + hashCode13) * 31;
        Integer num9 = this.appliVersion;
        if (num9 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = num9.hashCode();
        }
        int a14 = y1.a(this.isTrusted, (i22 + hashCode14) * 31, 31);
        Integer num10 = this.attrib;
        if (num10 != null) {
            i11 = num10.hashCode();
        }
        return a14 + i11;
    }

    public final boolean isSyncedToWs() {
        return this.isSyncedToWs;
    }

    public final boolean isTrusted() {
        return this.isTrusted;
    }

    public final void setActivityRecognitionData2(int i11) {
        this.activityRecognitionData2 = i11;
    }

    public final void setActivityStatus(int i11) {
        this.activityStatus = i11;
    }

    public final void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public final void setAlgoVersion(Integer num) {
        this.algoVersion = num;
    }

    public final void setApneaHypopneaIndex(Integer num) {
        this.apneaHypopneaIndex = num;
    }

    public final void setAppPfmId(Integer num) {
        this.appPfmId = num;
    }

    public final void setAppliVersion(Integer num) {
        this.appliVersion = num;
    }

    public final void setAscent(float f11) {
        if (f11 > (this.durationMillis * 200) / DateTimeConstants.MILLIS_PER_MINUTE) {
            f11 = 0.0f;
        }
        this.ascent = f11;
    }

    public final void setAttrib(Integer num) {
        this.attrib = num;
    }

    public final void setBreathingProbability(Integer num) {
        this.breathingProbability = num;
    }

    public final void setCalories(float f11) {
        this.calories = f11;
    }

    public final void setCategory(Category category) {
        this.category = category;
    }

    public final void setClassifierFeature(float f11) {
        this.classifierFeature = f11;
    }

    public final void setCoreTemperature(float f11) {
        this.coreTemperature = f11;
    }

    public final void setDeviceId(long j5) {
        this.deviceId = j5;
    }

    public final void setDeviceModel(int i11) {
        this.deviceModel = i11;
    }

    public final void setDistance(float f11) {
        this.distance = f11;
    }

    public final void setDurationMillis(int i11) {
        this.durationMillis = i11;
    }

    public final void setEarnedCalories(float f11) {
        this.earnedCalories = f11;
    }

    public final void setFirmwareVersion(Integer num) {
        this.firmwareVersion = num;
    }

    public final void setHeartRate(int i11) {
        this.heartRate = i11;
    }

    public final void setHeartRateMeasureQuality(int i11) {
        this.heartRateMeasureQuality = i11;
    }

    public final void setHrLevel(int i11) {
        this.hrLevel = i11;
    }

    public final void setHrState(int i11) {
        this.hrState = i11;
    }

    public final void setId(Long l5) {
        this.f46386id = l5;
    }

    public final void setMet(float f11) {
        this.met = f11;
    }

    public final void setPauseType(Integer num) {
        this.pauseType = num;
    }

    public final void setRespiratoryRate(int i11) {
        this.respiratoryRate = i11;
    }

    public final void setSkinTemperature(int i11) {
        this.skinTemperature = i11;
    }

    public final void setSleepDebug(int i11) {
        this.sleepDebug = i11;
    }

    public final void setSleepLevel(int i11) {
        this.sleepLevel = i11;
    }

    public final void setSnoringDurationRatio(int i11) {
        this.snoringDurationRatio = i11;
    }

    public final void setSpo2(Integer num) {
        this.spo2 = num;
    }

    public final void setSpo2Quality(Integer num) {
        this.spo2Quality = num;
    }

    public final void setStartDate(DateTime dateTime) {
        u.j(dateTime, "<set-?>");
        this.startDate = dateTime;
    }

    public final void setSteps(int i11) {
        this.steps = i11;
    }

    public final void setSwimLaps(int i11) {
        this.swimLaps = i11;
    }

    public final void setSwimMovements(int i11) {
        this.swimMovements = i11;
    }

    public final void setSwimType(int i11) {
        this.swimType = i11;
    }

    public final void setSyncedToWs(boolean z5) {
        this.isSyncedToWs = z5;
    }

    public final void setTrusted(boolean z5) {
        this.isTrusted = z5;
    }

    public final void setType(VasistasType vasistasType) {
        this.type = vasistasType;
    }

    public final void setUserId(Long l5) {
        this.userId = l5;
    }

    public final void setVersion(int i11) {
        this.version = i11;
    }

    public String toString() {
        DateTime dateTime = this.startDate;
        Long l5 = this.f46386id;
        Long l6 = this.userId;
        int i11 = this.durationMillis;
        VasistasType vasistasType = this.type;
        ActivityType activityType = this.activityType;
        Category category = this.category;
        float f11 = this.calories;
        float f12 = this.earnedCalories;
        float f13 = this.met;
        int i12 = this.sleepLevel;
        int i13 = this.sleepDebug;
        int i14 = this.snoringDurationRatio;
        int i15 = this.heartRate;
        int i16 = this.heartRateMeasureQuality;
        int i17 = this.skinTemperature;
        float f14 = this.coreTemperature;
        int i18 = this.activityStatus;
        int i19 = this.steps;
        float f15 = this.distance;
        float f16 = this.classifierFeature;
        int i21 = this.swimMovements;
        int i22 = this.swimLaps;
        int i23 = this.deviceModel;
        int i24 = this.activityRecognitionData2;
        int i25 = this.version;
        int i26 = this.swimType;
        long j5 = this.deviceId;
        Integer num = this.apneaHypopneaIndex;
        Integer num2 = this.breathingProbability;
        Integer num3 = this.pauseType;
        Integer num4 = this.spo2;
        Integer num5 = this.spo2Quality;
        boolean z5 = this.isSyncedToWs;
        int i27 = this.respiratoryRate;
        int i28 = this.hrLevel;
        int i29 = this.hrState;
        Integer num6 = this.algoVersion;
        Integer num7 = this.firmwareVersion;
        Integer num8 = this.appPfmId;
        Integer num9 = this.appliVersion;
        boolean z11 = this.isTrusted;
        Integer num10 = this.attrib;
        StringBuilder sb2 = new StringBuilder("Vasistas(startDate=");
        sb2.append(dateTime);
        sb2.append(", id=");
        sb2.append(l5);
        sb2.append(", userId=");
        sb2.append(l6);
        sb2.append(", durationMillis=");
        sb2.append(i11);
        sb2.append(", type=");
        sb2.append(vasistasType);
        sb2.append(", activityType=");
        sb2.append(activityType);
        sb2.append(", category=");
        sb2.append(category);
        sb2.append(", calories=");
        sb2.append(f11);
        sb2.append(", earnedCalories=");
        sb2.append(f12);
        sb2.append(", met=");
        sb2.append(f13);
        sb2.append(", sleepLevel=");
        v6.b.a(sb2, i12, ", sleepDebug=", i13, ", snoringDurationRatio=");
        v6.b.a(sb2, i14, ", heartRate=", i15, ", heartRateMeasureQuality=");
        v6.b.a(sb2, i16, ", skinTemperature=", i17, ", coreTemperature=");
        sb2.append(f14);
        sb2.append(", activityStatus=");
        sb2.append(i18);
        sb2.append(", steps=");
        sb2.append(i19);
        sb2.append(", distance=");
        sb2.append(f15);
        sb2.append(", classifierFeature=");
        sb2.append(f16);
        sb2.append(", swimMovements=");
        sb2.append(i21);
        sb2.append(", swimLaps=");
        v6.b.a(sb2, i22, ", deviceModel=", i23, ", activityRecognitionData2=");
        v6.b.a(sb2, i24, ", version=", i25, ", swimType=");
        sb2.append(i26);
        sb2.append(", deviceId=");
        sb2.append(j5);
        sb2.append(", apneaHypopneaIndex=");
        sb2.append(num);
        sb2.append(", breathingProbability=");
        sb2.append(num2);
        sb2.append(", pauseType=");
        sb2.append(num3);
        sb2.append(", spo2=");
        sb2.append(num4);
        sb2.append(", spo2Quality=");
        sb2.append(num5);
        sb2.append(", isSyncedToWs=");
        sb2.append(z5);
        q2.c(sb2, ", respiratoryRate=", i27, ", hrLevel=", i28);
        sb2.append(", hrState=");
        sb2.append(i29);
        sb2.append(", algoVersion=");
        sb2.append(num6);
        sb2.append(", firmwareVersion=");
        sb2.append(num7);
        sb2.append(", appPfmId=");
        sb2.append(num8);
        sb2.append(", appliVersion=");
        sb2.append(num9);
        sb2.append(", isTrusted=");
        sb2.append(z11);
        sb2.append(", attrib=");
        sb2.append(num10);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate) {
        this(startDate, null, null, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -2, 2047, null);
        u.j(startDate, "startDate");
    }

    /* renamed from: clone */
    public Vasistas m34clone() {
        DateTime dateTime = this.startDate;
        int i11 = this.durationMillis;
        Long l5 = this.f46386id;
        Long l6 = this.userId;
        VasistasType vasistasType = this.type;
        ActivityType activityType = this.activityType;
        float f11 = this.calories;
        float f12 = this.earnedCalories;
        float f13 = this.met;
        int i12 = this.sleepLevel;
        int i13 = this.sleepDebug;
        int i14 = this.heartRate;
        int i15 = this.heartRateMeasureQuality;
        int i16 = this.skinTemperature;
        int i17 = this.activityStatus;
        int i18 = this.steps;
        float f14 = this.distance;
        float f15 = this.classifierFeature;
        int i19 = this.swimMovements;
        int i21 = this.swimLaps;
        int i22 = this.deviceModel;
        Category category = this.category;
        boolean z5 = this.isSyncedToWs;
        int i23 = this.snoringDurationRatio;
        int i24 = this.activityRecognitionData2;
        int i25 = this.swimType;
        int i26 = this.version;
        long j5 = this.deviceId;
        Integer num = this.apneaHypopneaIndex;
        Integer num2 = this.breathingProbability;
        Integer num3 = this.spo2;
        Integer num4 = this.spo2Quality;
        int i27 = this.respiratoryRate;
        int i28 = this.hrLevel;
        int i29 = this.hrState;
        Integer num5 = this.algoVersion;
        Integer num6 = this.appPfmId;
        Integer num7 = this.appliVersion;
        Vasistas vasistas = new Vasistas(dateTime, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i23, i14, i15, i16, this.coreTemperature, i17, i18, f14, f15, i19, i21, i22, i24, i26, i25, j5, num, num2, null, num3, num4, z5, i27, i28, i29, num5, this.firmwareVersion, num6, num7, this.isTrusted, null, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH, 1024, null);
        vasistas.setAscent(vasistas.ascent);
        return vasistas;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5) {
        this(startDate, l5, null, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -4, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6) {
        this(startDate, l5, l6, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -8, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11) {
        this(startDate, l5, l6, i11, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -16, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType) {
        this(startDate, l5, l6, i11, vasistasType, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -32, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType) {
        this(startDate, l5, l6, i11, vasistasType, activityType, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -64, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -128, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -256, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -512, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -1024, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -2048, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -4096, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -8192, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -16384, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -32768, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -65536, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -131072, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -262144, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -524288, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -1048576, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -2097152, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -4194304, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -8388608, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -16777216, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -33554432, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -67108864, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -134217728, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -268435456, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -536870912, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -1073741824, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, null, null, false, 0, 0, 0, null, null, null, null, false, null, Integer.MIN_VALUE, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, null, false, 0, 0, 0, null, null, null, null, false, null, 0, 2047, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, false, 0, 0, 0, null, null, null, null, false, null, 0, 2046, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, z5, 0, 0, 0, null, null, null, null, false, null, 0, 2044, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5, int i27) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, z5, i27, 0, 0, null, null, null, null, false, null, 0, 2040, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5, int i27, int i28) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, z5, i27, i28, 0, null, null, null, null, false, null, 0, 2032, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5, int i27, int i28, int i29) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, z5, i27, i28, i29, null, null, null, null, false, null, 0, 2016, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5, int i27, int i28, int i29, Integer num6) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, z5, i27, i28, i29, num6, null, null, null, false, null, 0, 1984, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5, int i27, int i28, int i29, Integer num6, Integer num7) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, z5, i27, i28, i29, num6, num7, null, null, false, null, 0, 1920, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5, int i27, int i28, int i29, Integer num6, Integer num7, Integer num8) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, z5, i27, i28, i29, num6, num7, num8, null, false, null, 0, 1792, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5, int i27, int i28, int i29, Integer num6, Integer num7, Integer num8, Integer num9) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, z5, i27, i28, i29, num6, num7, num8, num9, false, null, 0, 1536, null);
        u.j(startDate, "startDate");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5, int i27, int i28, int i29, Integer num6, Integer num7, Integer num8, Integer num9, boolean z11) {
        this(startDate, l5, l6, i11, vasistasType, activityType, category, f11, f12, f13, i12, i13, i14, i15, i16, i17, f14, i18, i19, f15, f16, i21, i22, i23, i24, i25, i26, j5, num, num2, num3, num4, num5, z5, i27, i28, i29, num6, num7, num8, num9, z11, null, 0, 1024, null);
        u.j(startDate, "startDate");
    }

    public Vasistas(DateTime startDate, Long l5, Long l6, int i11, VasistasType vasistasType, ActivityType activityType, Category category, float f11, float f12, float f13, int i12, int i13, int i14, int i15, int i16, int i17, float f14, int i18, int i19, float f15, float f16, int i21, int i22, int i23, int i24, int i25, int i26, long j5, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, boolean z5, int i27, int i28, int i29, Integer num6, Integer num7, Integer num8, Integer num9, boolean z11, Integer num10) {
        u.j(startDate, "startDate");
        this.startDate = startDate;
        this.f46386id = l5;
        this.userId = l6;
        this.durationMillis = i11;
        this.type = vasistasType;
        this.activityType = activityType;
        this.category = category;
        this.calories = f11;
        this.earnedCalories = f12;
        this.met = f13;
        this.sleepLevel = i12;
        this.sleepDebug = i13;
        this.snoringDurationRatio = i14;
        this.heartRate = i15;
        this.heartRateMeasureQuality = i16;
        this.skinTemperature = i17;
        this.coreTemperature = f14;
        this.activityStatus = i18;
        this.steps = i19;
        this.distance = f15;
        this.classifierFeature = f16;
        this.swimMovements = i21;
        this.swimLaps = i22;
        this.deviceModel = i23;
        this.activityRecognitionData2 = i24;
        this.version = i25;
        this.swimType = i26;
        this.deviceId = j5;
        this.apneaHypopneaIndex = num;
        this.breathingProbability = num2;
        this.pauseType = num3;
        this.spo2 = num4;
        this.spo2Quality = num5;
        this.isSyncedToWs = z5;
        this.respiratoryRate = i27;
        this.hrLevel = i28;
        this.hrState = i29;
        this.algoVersion = num6;
        this.firmwareVersion = num7;
        this.appPfmId = num8;
        this.appliVersion = num9;
        this.isTrusted = z11;
        this.attrib = num10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Vasistas(org.joda.time.DateTime r43, java.lang.Long r44, java.lang.Long r45, int r46, com.withings.vasistas.model.Vasistas.VasistasType r47, com.withings.vasistas.model.Vasistas.ActivityType r48, com.withings.vasistas.model.Vasistas.Category r49, float r50, float r51, float r52, int r53, int r54, int r55, int r56, int r57, int r58, float r59, int r60, int r61, float r62, float r63, int r64, int r65, int r66, int r67, int r68, int r69, long r70, java.lang.Integer r72, java.lang.Integer r73, java.lang.Integer r74, java.lang.Integer r75, java.lang.Integer r76, boolean r77, int r78, int r79, int r80, java.lang.Integer r81, java.lang.Integer r82, java.lang.Integer r83, java.lang.Integer r84, boolean r85, java.lang.Integer r86, int r87, int r88, kotlin.jvm.internal.m r89) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.vasistas.model.Vasistas.<init>(org.joda.time.DateTime, java.lang.Long, java.lang.Long, int, com.withings.vasistas.model.Vasistas$VasistasType, com.withings.vasistas.model.Vasistas$ActivityType, com.withings.vasistas.model.Vasistas$Category, float, float, float, int, int, int, int, int, int, float, int, int, float, float, int, int, int, int, int, int, long, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, int, int, int, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, boolean, java.lang.Integer, int, int, kotlin.jvm.internal.m):void");
    }
}
