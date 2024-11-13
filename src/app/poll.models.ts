export interface OptionVote{
  optionText: string;
  voteCount: number;
}

export interface Poll {
  id: number;
  question: string;
 options: OptionVote[] //Option is an array of option vote.
}
