import json
stage='03'
data={}
data['width']=5
data['height']=5
data['hints']={}
data['hints']['horizontal']=['1','2','2','2','2']
data['hints']['vertical']=['0','0','4','5','0']
data['answer']=[]
data['answer'].append([0,0,0,0,0])
data['answer'].append([0,0,0,0,0])
data['answer'].append([0,1,1,1,1])
data['answer'].append([1,1,1,1,1])
data['answer'].append([0,0,0,0,0])
data['tips']=[]
line={}
line['type']='text'
line['content']='More Tips:'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Start with the highest numbers.'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Some number combinations have only one solution.'
line={}
line['type']='example'
line['content']='examples/01-1.json'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/01-2.json'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/01-3.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Now you are ready to start solving and creating!'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Click and drag tp fill multiple squares!'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/02.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Look at this row:'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/03-1.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='The 4-square segment could be in placed either...'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/03-2.json'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/03-3.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Either way, these 3 squares are always filled:'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/03-4.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Each number shows how long a line segment of filled squares in the current row or column there should be.'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/04.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Fill all squares as shown by the numbers.'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Each segment must be separated by at least one empty square.'
data['tips'].append(line)
line={}
line['type']='example'
line['content']='examples/05.json'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Do not forget:'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='If you know a square can not be filled, it helps to mark it with an X.'
data['tips'].append(line)
line={}
line['type']='text'
line['content']='Did you konw you can use the Spacebar to switch between filled spaces and Xs?'
data['tips'].append(line)
json.dump(data,open('stages/'+stage+'.json','w'),sort_keys=True)
