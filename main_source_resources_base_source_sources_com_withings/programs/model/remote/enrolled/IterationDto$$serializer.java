package com.withings.programs.model.remote.enrolled;

import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
/* compiled from: IterationDto.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/withings/programs/model/remote/enrolled/IterationDto.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/withings/programs/model/remote/enrolled/IterationDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/withings/programs/model/remote/enrolled/IterationDto;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lnm0/y;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/withings/programs/model/remote/enrolled/IterationDto;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class IterationDto$$serializer implements GeneratedSerializer<IterationDto> {
    public static final IterationDto$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        IterationDto$$serializer iterationDto$$serializer = new IterationDto$$serializer();
        INSTANCE = iterationDto$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.withings.programs.model.remote.enrolled.IterationDto", iterationDto$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.PROGRAM_ID, false);
        pluginGeneratedSerialDescriptor.addElement("iteration", false);
        pluginGeneratedSerialDescriptor.addElement(NavigationArguments.INSTANCE_ID, false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("start", false);
        pluginGeneratedSerialDescriptor.addElement("end", false);
        pluginGeneratedSerialDescriptor.addElement("menuDtos", true);
        pluginGeneratedSerialDescriptor.addElement("summary", true);
        pluginGeneratedSerialDescriptor.addElement("fullSummary", true);
        pluginGeneratedSerialDescriptor.addElement("progress", true);
        pluginGeneratedSerialDescriptor.addElement("unread", true);
        pluginGeneratedSerialDescriptor.addElement("programSwToken", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private IterationDto$$serializer() {
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = IterationDto.$childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        KSerializer<?> nullable = BuiltinSerializersKt.getNullable(longSerializer);
        KSerializer<?> nullable2 = BuiltinSerializersKt.getNullable(kSerializerArr[6]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, longSerializer, intSerializer, intSerializer, longSerializer, nullable, nullable2, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public IterationDto deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i11;
        Long l5;
        String str;
        Integer num;
        Boolean bool;
        String str2;
        int i12;
        String str3;
        List list;
        int i13;
        int i14;
        long j5;
        long j11;
        u.j(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor2);
        kSerializerArr = IterationDto.$childSerializers;
        int i15 = 10;
        int i16 = 9;
        char c11 = '\b';
        Long l6 = null;
        if (beginStructure.decodeSequentially()) {
            int decodeIntElement = beginStructure.decodeIntElement(descriptor2, 0);
            long decodeLongElement = beginStructure.decodeLongElement(descriptor2, 1);
            int decodeIntElement2 = beginStructure.decodeIntElement(descriptor2, 2);
            int decodeIntElement3 = beginStructure.decodeIntElement(descriptor2, 3);
            long decodeLongElement2 = beginStructure.decodeLongElement(descriptor2, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            list = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], null);
            i11 = decodeIntElement;
            str = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 11, stringSerializer, null);
            bool = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, 10, BooleanSerializer.INSTANCE, null);
            num = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, 9, IntSerializer.INSTANCE, null);
            str3 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 7, stringSerializer, null);
            l5 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, null);
            i13 = decodeIntElement3;
            str2 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 8, stringSerializer, null);
            i12 = 4095;
            i14 = decodeIntElement2;
            j5 = decodeLongElement;
            j11 = decodeLongElement2;
        } else {
            String str4 = null;
            Integer num2 = null;
            Boolean bool2 = null;
            String str5 = null;
            boolean z5 = true;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            long j12 = 0;
            long j13 = 0;
            String str6 = null;
            List list2 = null;
            while (z5) {
                int decodeElementIndex = beginStructure.decodeElementIndex(descriptor2);
                switch (decodeElementIndex) {
                    case -1:
                        z5 = false;
                        break;
                    case 0:
                        i18 |= 1;
                        i17 = beginStructure.decodeIntElement(descriptor2, 0);
                        i15 = 10;
                        i16 = 9;
                        break;
                    case 1:
                        j12 = beginStructure.decodeLongElement(descriptor2, 1);
                        i18 |= 2;
                        i15 = 10;
                        i16 = 9;
                        break;
                    case 2:
                        i21 = beginStructure.decodeIntElement(descriptor2, 2);
                        i18 |= 4;
                        i15 = 10;
                        i16 = 9;
                        break;
                    case 3:
                        i19 = beginStructure.decodeIntElement(descriptor2, 3);
                        i18 |= 8;
                        i15 = 10;
                        i16 = 9;
                        break;
                    case 4:
                        j13 = beginStructure.decodeLongElement(descriptor2, 4);
                        i18 |= 16;
                        i15 = 10;
                        i16 = 9;
                        break;
                    case 5:
                        l6 = (Long) beginStructure.decodeNullableSerializableElement(descriptor2, 5, LongSerializer.INSTANCE, l6);
                        i18 |= 32;
                        i15 = 10;
                        i16 = 9;
                        break;
                    case 6:
                        list2 = (List) beginStructure.decodeNullableSerializableElement(descriptor2, 6, kSerializerArr[6], list2);
                        i18 |= 64;
                        i15 = 10;
                        break;
                    case 7:
                        str6 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 7, StringSerializer.INSTANCE, str6);
                        i18 |= 128;
                        i15 = 10;
                        break;
                    case 8:
                        str5 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 8, StringSerializer.INSTANCE, str5);
                        i18 |= 256;
                        c11 = '\b';
                        i15 = 10;
                        continue;
                    case 9:
                        num2 = (Integer) beginStructure.decodeNullableSerializableElement(descriptor2, i16, IntSerializer.INSTANCE, num2);
                        i18 |= 512;
                        break;
                    case 10:
                        bool2 = (Boolean) beginStructure.decodeNullableSerializableElement(descriptor2, i15, BooleanSerializer.INSTANCE, bool2);
                        i18 |= 1024;
                        break;
                    case 11:
                        str4 = (String) beginStructure.decodeNullableSerializableElement(descriptor2, 11, StringSerializer.INSTANCE, str4);
                        i18 |= ModuleCopy.f28574b;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
                c11 = '\b';
            }
            i11 = i17;
            l5 = l6;
            str = str4;
            num = num2;
            bool = bool2;
            str2 = str5;
            i12 = i18;
            str3 = str6;
            list = list2;
            i13 = i19;
            i14 = i21;
            j5 = j12;
            j11 = j13;
        }
        beginStructure.endStructure(descriptor2);
        return new IterationDto(i12, i11, j5, i14, i13, j11, l5, list, str3, str2, num, bool, str, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(Encoder encoder, IterationDto value) {
        u.j(encoder, "encoder");
        u.j(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor2);
        IterationDto.write$Self$android_release(value, beginStructure, descriptor2);
        beginStructure.endStructure(descriptor2);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
