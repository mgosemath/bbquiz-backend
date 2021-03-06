package in.theuniquemedia.brainbout.user.vo;

import in.theuniquemedia.brainbout.quiz.vo.QuizVO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by mahesh on 2/26/17.
 */
public class QuizResponseVO implements Serializable {
    public List<QuizVO> quizVOList;
    public Integer timeLeft;

    public List<QuizVO> getQuizVOList() {
        return quizVOList;
    }

    public void setQuizVOList(List<QuizVO> quizVOList) {
        this.quizVOList = quizVOList;
    }

    public Integer getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(Integer timeLeft) {
        this.timeLeft = timeLeft;
    }
}
