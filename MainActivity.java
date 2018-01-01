    int scoreR = 0;
    int ShotsInR = 0;
    int FaolsR = 0;
    int CornersR = 0;
    int PenaltyR = 0;
    int YellowCardsR = 0;
    int RedCardsR = 0;
    int OffsidR = 0;
    int ScoreL = 0;
    int ShotsInL = 0;
    int FaolsL = 0;
    int CornersL = 0;
    int PenaltyL = 0;
    int YellowCardsL = 0;
    int RedCardsL = 0;
    int OffsideL = 0;

    public void Reset(View view) {
        scoreR = 0;
        ShotsInR = 0;
        FaolsR = 0;
        CornersR = 0;
        PenaltyR = 0;
        YellowCardsR = 0;
        RedCardsR = 0;
        OffsidR = 0;
        ScoreL = 0;
        ShotsInL = 0;
        FaolsL = 0;
        CornersL = 0;
        PenaltyL = 0;
        YellowCardsL = 0;
        RedCardsL = 0;
        OffsideL = 0;
        displayForRmResult(0);
        displayForRmShots(0);
        displayForRmFaols(0);
        displayForRmCorners(0);
        displayForRmPenalty(0);
        displayForRmYellowCards(0);
        displayForRmRedCards(0);
        displayForRmOffsides(0);
        displayForLpResult(0);
        displayForLpShots(0);
        displayForLpFaols(0);
        displayForLpCorners(0);
        displayForLpPenalty(0);
        displayForLpYellowCards(0);
        displayForLpRedCards(0);
        displayForLpOffsides(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForRmResult(0);
        displayForRmShots(0);
        displayForRmFaols(0);
        displayForRmCorners(0);
        displayForRmPenalty(0);
        displayForRmYellowCards(0);
        displayForRmRedCards(0);
        displayForRmOffsides(0);
        displayForLpResult(0);
        displayForLpShots(0);
        displayForLpFaols(0);
        displayForLpCorners(0);
        displayForLpPenalty(0);
        displayForLpYellowCards(0);
        displayForLpRedCards(0);
        displayForRmOffsides(0);

    }


    /**
     * Displays the given score for Real Madrid.
     */
    public void displayForRmResult(int score) {
        TextView scoreView = (TextView) findViewById(R.id.TeamOneResult);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentGoalsR(View view) {
        scoreR = scoreR + 1;
        displayForRmResult(scoreR);
    }

    public void decrementGoalsR(View view) {
        scoreR = scoreR - 1;
        displayForRmResult(scoreR);
    }

    /**
     * Displays the given score for Real Madrid.
     */
    public void displayForRmShots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RmShotin);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentShotsR(View view) {
        ShotsInR = ShotsInR + 1;
        displayForRmShots(ShotsInR);
    }

    public void decrecmentShotsR(View view) {
        ShotsInR = ShotsInR - 1;
        displayForRmShots(ShotsInR);
    }

    /**
     * Displays the given Faols for Real Madrid.
     */
    public void displayForRmFaols(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RmFaols);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentFaolsR(View view) {
        FaolsR = FaolsR + 1;
        displayForRmFaols(FaolsR);
    }

    public void decrecmentFaolsR(View view) {
        FaolsR = FaolsR - 1;
        displayForRmFaols(FaolsR);
    }

    /**
     * Displays the given Corners for Real Madrid.
     */
    public void displayForRmCorners(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RmCorners);
        scoreView.setText(String.valueOf(score));
    }

    public void incecmentCornersR(View view) {
        CornersR = CornersR + 1;
        displayForRmCorners(CornersR);
    }

    public void decrecmentCornersR(View view) {
        CornersR = CornersR - 1;
        displayForRmCorners(CornersR);
    }

    /**
     * Displays the given Penalty for Real Madrid.
     */
    public void displayForRmPenalty(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RmPenalty);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentPenaltyR(View view) {
        PenaltyR = PenaltyR + 1;
        displayForRmPenalty(PenaltyR);
    }

    public void decrecmentPenaltyR(View view) {
        PenaltyR = PenaltyR - 1;
        displayForRmPenalty(PenaltyR);
    }

    /**
     * Displays the given Yellow Cards for Real Madrid.
     */
    public void displayForRmYellowCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RmYellowCards);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentYellowR(View view) {
        YellowCardsR = YellowCardsR + 1;
        displayForRmYellowCards(YellowCardsR);
    }

    public void decrecmentYellowR(View view) {
        YellowCardsR = YellowCardsR - 1;
        displayForRmYellowCards(YellowCardsR);
    }


    /**
     * Displays the given Red Cards for Real Madrid.
     */
    public void displayForRmRedCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RmRedCards);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentRedR(View view) {
        RedCardsR = RedCardsR + 1;
        displayForRmRedCards(RedCardsR);
    }

    public void decrecmentRedR(View view) {
        RedCardsR = RedCardsR - 1;
        displayForRmRedCards(RedCardsR);
    }

    /**
     * Displays the given OffSides for Real Madrid.
     */
    public void displayForRmOffsides(int score) {
        TextView scoreView = (TextView) findViewById(R.id.RmOffside);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentOffsideR(View view) {
        OffsidR = OffsidR + 1;
        displayForRmOffsides(OffsidR);
    }

    public void decrecmentOffsideR(View view) {
        OffsidR = OffsidR - 1;
        displayForRmOffsides(OffsidR);
    }

    /**
     * Displays the given score for Liver Pool.
     */
    public void displayForLpResult(int score) {
        TextView scoreView = (TextView) findViewById(R.id.TeamTwoResult);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentGoalsL(View view) {
        ScoreL = ScoreL + 1;
        displayForLpResult(ScoreL);
    }

    public void decrecmentGoalsL(View view) {
        ScoreL = ScoreL - 1;
        displayForLpResult(ScoreL);
    }


    /**
     * Displays the given Shots for Liver Pool.
     */
    public void displayForLpShots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.LfShotIn);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentShotsL(View view) {
        ShotsInL = ShotsInL + 1;
        displayForLpShots(ShotsInL);
    }

    public void decrecmentShotsL(View view) {
        ShotsInL = ShotsInL - 1;
        displayForLpShots(ShotsInL);
    }

    /**
     * Displays the given Faols for Liver Pool.
     */
    public void displayForLpFaols(int score) {
        TextView scoreView = (TextView) findViewById(R.id.LpFaols);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentFaolsL(View view) {
        FaolsL = FaolsL + 1;
        displayForLpFaols(FaolsL);
    }

    public void decrementFaolsL(View view) {
        FaolsL = FaolsL - 1;
        displayForLpFaols(FaolsL);
    }

    /**
     * Displays the given Corners for Liver Pool.
     */
    public void displayForLpCorners(int score) {
        TextView scoreView = (TextView) findViewById(R.id.LpCorners);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentCornersL(View view) {
        CornersL = CornersL + 1;
        displayForLpCorners(CornersL);
    }

    public void decrecmentCornersL(View view) {
        CornersL = CornersL - 1;
        displayForLpCorners(CornersL);
    }

    /**
     * Displays the given Penalty for Liver Pool.
     */
    public void displayForLpPenalty(int score) {
        TextView scoreView = (TextView) findViewById(R.id.LpPenalty);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentPenaltyL(View view) {
        PenaltyL = PenaltyL + 1;
        displayForLpPenalty(PenaltyL);
    }

    public void decrecmentPenaltyL(View view) {
        PenaltyL = PenaltyL - 1;
        displayForLpPenalty(PenaltyL);
    }

    /**
     * Displays the given Yellow Cards for Liver Pool.
     */
    public void displayForLpYellowCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.LpYellowCards);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentYellowL(View view) {
        YellowCardsL = YellowCardsL + 1;
        displayForLpYellowCards(YellowCardsL);
    }

    public void decrecmentYellowL(View view) {
        YellowCardsL = YellowCardsL - 1;
        displayForLpYellowCards(YellowCardsL);
    }

    /**
     * Displays the given Red Cards for Liver Pool.
     */
    public void displayForLpRedCards(int score) {
        TextView scoreView = (TextView) findViewById(R.id.LpRedCards);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentRedL(View view) {
        RedCardsL = RedCardsL + 1;
        displayForLpRedCards(RedCardsL);
    }

    public void decrementRedL(View view) {
        RedCardsL = RedCardsL - 1;
        displayForLpRedCards(RedCardsL);
    }

    /**
     * Displays the given Red Cards for Liver Pool.
     */
    public void displayForLpOffsides(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Lpoffside);
        scoreView.setText(String.valueOf(score));
    }

    public void increcmentOffsideL(View view) {
        OffsideL = OffsideL + 1;
        displayForLpOffsides(OffsideL);
    }

    public void decrecmentOffsideL(View view) {
        OffsideL = OffsideL - 1;
        displayForLpOffsides(OffsideL);
    }
