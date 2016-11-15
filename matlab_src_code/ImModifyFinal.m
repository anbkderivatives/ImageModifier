clear all;
%//////////////////////////////////////////////////////////////////////////
%--------------------Eisagwgh Stoixeiwn------------------------------------
%Kwdikos Seiras Ari8mhshs
Code = 'GRGSA-MAG_BLA013.01_000009';
%Seiras Ari8mhshs Fullou
ArF = 178;

%Fulla me parapanw apo mia selida (fulla me polles selides)
% p.x FSel = [ 12 15, 23 24, 32 54 ]; Dhl 12 ews 15, 32 ews 54
FSel = [];
%//////////////////////////////////////////////////////////////////////////

%numel(FSel)-> posa stoixeia exei o pinakas FSel
if ( mod (numel(FSel),2) == 1  )
    disp('Den einai zygos o ari8mos tou pinaka FSel');
        return;
end

%Apo8hkeuontai ola ta arxeia .jpg ston pinaka srcFiles
srcFiles = dir('*.jpg');

%--------Arxikopoihseis-----------------------
ArS=1; %ari8mhshh selidwn
%metablhtes opou stamatoun thn roh aru8mhshs twn fyllwn kai selidwn antistoixa
StopArF=0;
StopArS=1;
modifySel=0;
%----------------------------------------------

for i = 1 : length(srcFiles)    

    %Analoga me to mhkos ths ari8mhshs prosarmozetai to teliko FileName
    LengthArF = length( int2str(ArF) );
    if(LengthArF == 1)
        FileName = [ Code , '_00000' , int2str(ArF)];
    elseif(LengthArF == 2)
        FileName = [ Code , '_0000' , int2str(ArF)];
    elseif(LengthArF == 3)
        FileName = [ Code , '_000' , int2str(ArF)];
    elseif(LengthArF == 4)
        FileName = [ Code , '_00' , int2str(ArF)];
    end

    %--------------Periptwsh opou exoume ari8mhsh selidwn------------------
    if(isempty(FSel) == 0)
        if( i == FSel(1) )
            StopArF = 1; %Stamataei h ari8mhsh twn fullwn
            StopArS = 0; %Ksekinaei h ari8mhsh twn selidwn
            ArS=1;
            modifySel  = 1; 
        end
    end
    
    if(modifySel == 1)
        LengthArS = length( int2str(ArS) );
        if(LengthArS == 1)
            FileName = [ FileName , '_00000' , int2str(ArS)];
        elseif(LengthArS == 2)
            FileName = [ FileName , '_0000' , int2str(ArS)];
        end
    end
    
    if(isempty(FSel) == 0)
        if(i == FSel(2) )
            StopArF = 0; %Ksekinaei h ari8mhsh twn fullwn
            StopArS = 1; %Stamataei h ari8mhsh twn selidwn
            modifySel  = 0;
            % Diagrafi twn duo protwn stoixeiwn apo to pinaka FSel
            FSel(1) = []; %1o stoixeio
            FSel(1) = []; %2o stoixeio
        end
    end
    %----------------------------------------------------------------------
    
    ImageName = strcat(srcFiles(i).name);
    I = imread(ImageName);
    [height,width,dimension] = size(I);
    
    %prosti8etai h katalh3h .jpg
    FileName = [FileName , '.jpg'];

    if(height >= width) 
        %disp('height');
        IR = imresize(I,[1280 NaN]); %preserve the ratio
        imwrite(IR,FileName);
    else
        %disp('width');
        IR = imresize(I,[NaN 1280]);
        imwrite(IR,FileName ,'quality', 100);
    end
    
    if(StopArF == 0) ArF = ArF + 1;
    elseif(StopArS == 0 ) ArS = ArS + 1;
    end
end

clear all;